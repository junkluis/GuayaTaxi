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
        //edad minimo 25 años
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                                                                "GYZ1234",
                                                                     "Nissan",
                                                                 25,
                                                                      "Sanborondon");
        assertTrue(chofer_valido);
        //edad maximo 65 años
        boolean chofer_valido2 = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Nissan",
                65,
                "Samborondon");
        assertTrue(chofer_valido2);

        //Nombre con minimo 5 letras
        boolean chofer_valido3 = MainActivity.VerificarChofer( "Jorge",
                "GSW4565",
                "KIA",
                26,
                "Norte");
        assertTrue(chofer_valido3);

        //Nombre con maximo 20 letras
        boolean chofer_valido4 = MainActivity.VerificarChofer( "Jorge Luis Rodriguez",
                "GSW4565",
                "Honda",
                26,
                "Norte");
        assertTrue(chofer_valido4);
    }

    @Test
    public void SueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
        //
        double sueldo_taxista2 = MainActivity.CalcularSueldoChofer("GSW4565",
                26,
                "Norte");
        assertEquals(300, sueldo_taxista2, 2);

        //50 dolares extras al sueldo por ser mayor de 50 años
        double sueldo_taxista3 = MainActivity.CalcularSueldoChofer("GSW4565",
                51,
                "Norte");
        assertEquals(350, sueldo_taxista3, 2);
    }


}
