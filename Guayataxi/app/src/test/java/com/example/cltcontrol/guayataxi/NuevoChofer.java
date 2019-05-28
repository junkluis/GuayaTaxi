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
    public void choferJovenCP1() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis",
                                                                "PYZ1234",
                                                                     "Nissan",
                                                                 25,
                                                                      "Sanborondon");
        assertTrue(chofer_valido);

    }

    @Test
    public void choferJovenCP2() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis R",
                                                                "PYZ1234",
                                                                     "Nissan",
                                                                 25,
                                                                      "Sanborondon");
        assertTrue(chofer_valido);
    }



    @Test
    public void SueldoChoferJovenCP1() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("RYZ1234",
                                                                    24,
                                                                        "Samborondon");
        assertEquals(252, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJovenC2() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("RYZ1234",
                                                                    55,
                                                                        "Samborondon");
        assertEquals(297, sueldo_taxista, 2);
    }


}
