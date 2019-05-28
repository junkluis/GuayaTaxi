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
    public void nombreChoferInvalido() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Miguel Angel Sanchez Romero",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void nombreChoferCaracterInvalido() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Miguel S@nchez",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void marcaVehiculoInvalid() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Miguel Sanchez",
                "GYZ1234",
                "Hyundai",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void edadChoferInvalida() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Miguel Sanchez",
                "GYZ1234",
                "Nissan",
                70,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void placaVehiculoInvalida() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Miguel Sanchez",
                "TEU1234",
                "Nissan",
                30,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void placaVehiculoMasCarteresInvalida() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Miguel Sanchez",
                "TETU1234",
                "Nissan",
                70,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferMayorPichincha() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                60,
                "Centro");
        assertEquals(400, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferMayorGuayas() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                60,
                "Norte");
        assertEquals(350, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJovenRios() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("RYZ1234",
                30,
                "Sur");
        assertEquals(280, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJovenRiosSambo() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("RYZ1234",
                30,
                "Samborondon");
        assertEquals(252, sueldo_taxista, 2);
    }

}k
