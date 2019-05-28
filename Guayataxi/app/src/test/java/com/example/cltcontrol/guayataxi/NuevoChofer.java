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
    public void choferPrueba1() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Gerogeiyeuyryuruweutgertertertrugr!",
                "OTH6754",
                "Hyundai",
                26,
                "Ceibos");
        assertTrue(chofer_valido);
    }
    @Test
    public void choferPrueba2() {
        boolean chofer_valido = MainActivity.VerificarChofer( "George Lucas",
                "GTH6754",
                "Nissan",
                26,
                "Centro");
        assertTrue(chofer_valido);
    }
    @Test
    public void choferPrueba3() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Lucas20",
                "OTH6754",
                "Chevrolet",
                65,
                "Norte");
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
    public void sueldoPrueba1() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GTYU56373",
                30,
                "Via a la costa");
        assertEquals(300, sueldo_taxista, 2);
    }
    @Test
    public void sueldoPrueba2() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GTY5637",
                30,
                "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }
    @Test
    public void sueldoPrueba3() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                100,
                "Centro");
        assertEquals(400, sueldo_taxista, 2);
    }

}
