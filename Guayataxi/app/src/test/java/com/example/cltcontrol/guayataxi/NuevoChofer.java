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
    public void verificarNombreChoferSinNumero() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Lui2s Zuniga",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }
    @Test
    public void verificarNombreChoferporLongitud() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zunigaaaaaaaaaaaaaaaaaaaaaskdhfalksfhas",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }



    @Test
    public void verificarNombreChoferporCaracterEspeciales() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis @ds",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void VerificarMarcaAuto() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Ford",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

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
    public void choferMuyJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Nissan",
                5,
                "Sanborondon");
        assertFalse(chofer_valido);
    }
    @Test
    public void choferMuyViejo() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Nissan",
                295,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void placaValida() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Nissan",
                25,
                "Sanborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void placaValidaPorLongitud() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ12334",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void placaValidaPorFormato() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYFZ134",
                "Nissan",
                25,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void placaValidaPorLetraInicial() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "KYFZ134",
                "Nissan",
                25,
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
    //No es de Samborondon
    public void SueldoChoferCholo() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                25,
                "Norte");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferViejo() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                51,
                "Samborondon");
        assertEquals(315, sueldo_taxista, 2);
    }




}
