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
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "alex",
                                                                "RAE1234",
                                                                     "Vitara",
                                                                 25,
                                                                      "Samborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "alex javier ubilla torres",
                                                                "AYZ12345",
                                                                     "Nissan",
                                                                 24,
                                                                      "Norte");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "xavier",
                                                                "GYZA234",
                                                                     "Toyota",
                                                                 40,
                                                                      "Durán");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Ubilla",
                                                                "GY31234",
                                                                     "KIA",
                                                                 50,
                                                                      "Sur");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "javier",
                                                                "PYZ1234",
                                                                     "Nissan",
                                                                 60,
                                                                      "Centro");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "ubilla",
                                                                "RYZ1234",
                                                                     "Nissan",
                                                                 55,
                                                                      "Daule");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "torres",
                                                                "MYZ1234",
                                                                     "Aveo",
                                                                 65,
                                                                      "Sur");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "xavier",
                                                                "CYZ1234",
                                                                     "KIA",
                                                                 67,
                                                                      "Centro");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "ubilla",
                                                                "GYZ1234",
                                                                     "Toyota",
                                                                 30,
                                                                      "Sur");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "torres",
                                                                "GA1234",
                                                                     "Honda",
                                                                 35,
                                                                      "Daule");
        assertTrue(chofer_valido);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Samborondon");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("RYZ1234",
                                                                    55,
                                                                        "Samborondon");
        assertEquals(297, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("MYZ1234",
                                                                    60,
                                                                        "Norte");
        assertEquals(370, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                                                                    65,
                                                                        "Centro");
        assertEquals(400, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    30,
                                                                        "Sur");
        assertEquals(300, sueldo_taxista, 2);
    }

}
