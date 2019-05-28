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
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis",
                                                                "GYZ1234",
                                                                     "Nissan",
                                                                 30,
                                                                      "Norte");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven2() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Guevara",
                "GYZ1234",
                "Nissan",
                50,
                "Samborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven3() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Guevara pEDRO zUMIZATA",
                "GYZ1234",
                "Nissan",
                70,
                "Oeste");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferJoven4() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis ",
                "GYZH234",
                "Nissan",
                55,
                "Samborondon");
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
    public void SueldoChoferJoven2() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                30,
                "Norte");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven3() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                50,
                "Samborondon");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJoven4() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                25,
                "Samborondon");
        assertEquals(300, sueldo_taxista, 2);
    }


}
