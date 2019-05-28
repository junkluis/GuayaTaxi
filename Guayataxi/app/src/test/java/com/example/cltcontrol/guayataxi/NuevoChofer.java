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
                                                                "GYR7234",
                                                                     "Nissan",
                                                                 25,
                                                                      "Samborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                                                                    25,
                                                                        "Norte");
        assertEquals(350, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferMayor() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                51,
                "Norte");
        assertEquals(400, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJovenSamborondon() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                25,
                "Samborondon");
        assertEquals(315, sueldo_taxista, 2);
    }

    @Test
    public void choferAdulto() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYR7234",
                "Nissan",
                65,
                "Samborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void MarcaVehiculo() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYR7234",
                "Nissan",
                65,
                "Samborondon");
        assertTrue(chofer_valido);
    }
}
