package com.example.cltcontrol.guayataxi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class NuevoChofer {

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                                                                "GYZ1234",
                                                                     "Nissan",
                                                                 25,
                                                                      "Sanborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }

    //////////////////////// pruebas unitarias taller
    @Test
    public void Chofer_nombre_caracter_especial() {
        //Prueba con caracteres especiales en el nombre, en este caso un nombre con tilde
        boolean chofer_valido = MainActivity.VerificarChofer( "Luís Zuniga",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertTrue(chofer_valido);
    }
    @Test
    public void Chofer_Marca_No_Valida() {
        //Prueba con marca no valida de vehiculo
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                                                                "GYZ1234",
                                                                "Chevrolet",
                                                                25,
                                                                "Sanborondon");
        assertTrue(chofer_valido);
    }
    @Test
    public void Chofer_Area_No_Valida() {
        //Prueba con area no valida
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                                                                "GYZ1234",
                                                                "Honda",
                                                                25,
                                                                "Huasmo");
        assertTrue(chofer_valido);
    }
    @Test
    public void Chofer_edad_Mayor() {
        //Prueba con edad mayor a la requerida
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                                                                "GYZ1234",
                                                                "Honda",
                                                                66,
                                                                "Norte");
        assertTrue(chofer_valido);
    }
    @Test
    public void Chofer_placa_incial_no_valida() {
        //Prueba con letra inicial de placa no valida
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                                                                "WYZ1234",
                                                                "Honda",
                                                                30,
                                                                "Norte");
        assertTrue(chofer_valido);
    }

    @Test
    public void SueldoChoferMenor() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    20,
                                                                    "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }
    @Test
    public void SueldoChoferMayorBono() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    55,
                                                                    "Norte");
        assertEquals(350, sueldo_taxista, 2);
    }
    @Test
    public void SueldoPlacaNoValida() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("AYZ1234",
                                                                    55,
                                                                    "Norte");
        assertEquals(50, sueldo_taxista, 2);
    }
}
