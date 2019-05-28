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
    public void SueldoSueldoTExpSur() {
        double sueldo_esperado = 300;
        double sueldo_real = MainActivity.CalcularSueldoChofer( "PED5623",
                32,
                "Sur");
        assertEquals( sueldo_esperado, sueldo_real);
    }

    @Test
    public void SueldoSueldoTExp() {
        double sueldo_esperado = 300;
        double sueldo_real = MainActivity.CalcularSueldoChofer( "PED5623",
                32,
                "Sur");
        assertEquals( sueldo_esperado, sueldo_real);
    }

}
