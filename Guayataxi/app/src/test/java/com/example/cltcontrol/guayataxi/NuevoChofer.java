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
        boolean chofer_valido = MainActivity.VerificarChofer("Luis Zuniga",
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
    public void CP1() {
        boolean chofer_valido = MainActivity.VerificarChofer("Luis Zuniga",
                "XYZ1234",
                "Nissan",
                60,
                "Norte");
        assertTrue(chofer_valido);
    }

    @Test
    public void CP2() {
        boolean chofer_valido = MainActivity.VerificarChofer("Lu Zuniga",
                "XYZ124",
                "Chevrolet",
                75,
                "Milagro");
        assertTrue(chofer_valido);
    }

    @Test
    public void CP3() {
        boolean chofer_valido = MainActivity.VerificarChofer("Luis Zuniga",
                "XYZ1234",
                "Chevrolet",
                25,
                "Norte");
        assertTrue(chofer_valido);
    }

    @Test
    public void CP4() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                25,
                "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }

    @Test
    public void CP5() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                52,
                "Norte");
        assertEquals(400, sueldo_taxista, 2);
    }

    @Test
    public void CP6() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                24,
                "Norte");
        assertEquals(300, sueldo_taxista, 2);
    }

}
