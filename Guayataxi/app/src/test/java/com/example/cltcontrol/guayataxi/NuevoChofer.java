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
    public void choferMuyJoven() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Nissan",
                24,
                "Sanborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void choferViejo() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GAQ1234",
                "Honda",
                65,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void choferMuyViejo() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GAQ1234",
                "Honda",
                66,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void PlacaMinuscula() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "gaq1234",
                "Honda",
                65,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void PlacaNoHabil() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "LXY234",
                "Honda",
                65,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void PlacaMuchosCaracteres() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "Gaui1234",
                "Honda",
                65,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void marcaNoEnLista() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "Gyz1234",
                "sever",
                30,
                "Sanborondon");
        assertFalse(chofer_valido);
    }

    @Test
    public void areaNula() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Luis Zuniga",
                "GYZ1234",
                "Honda",
                65,
                null);
        assertFalse(chofer_valido);
    }

    @Test
    public void SueldoChoferJovenGuayaquil() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                    25,
                                                                        "Urdesa");
        assertEquals(300, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferViejoPichincha() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("PYZ1234",
                65,
                "Urdesa");
        assertEquals(400, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferViejoRios() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("RYZ1234",
                51,
                "Urdesa");
        assertEquals(330, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJovenManabi() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("MYZ1234",
                50,
                "Urdesa");
        assertEquals(370, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferJovenSamborondon() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                50,
                "Samborondon");
        assertEquals(270, sueldo_taxista, 2);
    }

    @Test
    public void SueldoChoferViejoSamborondon() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                51,
                "Samborondon");
        assertEquals(315, sueldo_taxista, 2);
    }
}
