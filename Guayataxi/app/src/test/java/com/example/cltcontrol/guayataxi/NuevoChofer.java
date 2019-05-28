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

        /*"Luis Zuniga",
        "GYZ1234",
        "Nissan",
        25,
        "Sanborondon"*/

        /*CP1
        "byron 16",
        "AB1234",
        "Jac",
        20,
        "Via la costa"*/

        /*CP2
        "byron@16",
        "AB1234",
        "Jac",
        20,
        "Via la costa"*/

        /*CP3
        "byron@16",
        "ABC1234",
        "Jac",
        20,
        "Via la costa"*/

        /*CP4
        "byron@16",
        "ABC1234",
        "Nissan",
        20,
        "Via la costa"*/

        /*CP5
        "byron@16",
        "ABC1234",
        "Nissan",
        29,
        "Via la costa"*/

        /*CP6
        "byron@16",
        "ABC1234",
        "Nissan",
        29,
        "Norte"*/

        /*CP7
        "byron povea",
        "ABC1234",
        "Nissan",
        29,
        "Norte"*/

        boolean chofer_valido = MainActivity.VerificarChofer( "byron povea",
                "ABC1234",
                "Nissan",
                29,
                "Norte");
        assertTrue(chofer_valido);
        // assertFalse(chofer_valido);
    }

    @Test
    public void SueldoChoferJoven() {
        /*
        "GYZ1234",
        25,
        "Samborondon"
        */

        /*CP1
        "PB1234",
        20,
        "Via la costa"
        */

        /*CP2
        "PB1234",
        51,
        "Via la costa"*/
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PB1234",
                51,
                "Via la costa");
        assertEquals(400, sueldo_taxista, 2);
    }

}
