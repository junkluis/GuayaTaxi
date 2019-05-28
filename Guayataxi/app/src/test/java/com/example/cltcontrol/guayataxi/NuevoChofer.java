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

    @Test
    public void prueba1chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis",
                "BYZ1234",
                "Nissan",
                20,
                "Sanborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void prueba2chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Juan",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void prueba3chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Juan",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void prueba4chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Juan",
                "GYZ123b",
                "Nissan",
                25,
                "Sanborondon");
        assertTrue(chofer_valido);
    }


    @Test
    public void prueba1SueldoChofer() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                51,
                "norte");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void prueba1SueldoChofer2() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                51,
                "norte");
        assertEquals(350, sueldo_taxista, 2);
    }



}
