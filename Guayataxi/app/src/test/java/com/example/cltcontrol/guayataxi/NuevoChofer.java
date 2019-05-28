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
    public void choferEdadMayor(){
        boolean chofer_edad_imposible = MainActivity.VerificarChofer("Genesis Plua",
                "GBC1566",
                "Honda",
                70,
                "Salinas");
        assertTrue(chofer_edad_imposible);
    }

    @Test
    public void choferNombreTilde(){
        boolean chofer_nombre = MainActivity.VerificarChofer("Génesis Plua",
                "GBC1566",
                "Honda",
                50,
                "Salinas");
        assertTrue(chofer_nombre);
    }

    @Test
    public void placaInvalida(){
        boolean placaInvalida = MainActivity.VerificarChofer("Genesis Plua",
                "XBCD566",
                "Honda",
                25,
                "Salinas");
        assertTrue(placaInvalida);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Samborondon");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void EdadMayor() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                55,
                "Samborondon");
        assertEquals(315, sueldo_taxista, 2);
    }

    @Test
    public void AreaDistinta() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                25,
                "Paztaza");
        assertEquals(350, sueldo_taxista, 2);
    }

    @Test
    public void EdadMayorArea() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("MYZ1234",
                55,
                "Manabi");
        assertEquals(370, sueldo_taxista, 2);
    }
}
