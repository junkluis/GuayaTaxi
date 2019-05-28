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
        assertEquals(300, sueldo_taxista, 2);
    }


    //CP1nombrechofer="Dani", numeroplaca="GTE2345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp1Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "Dani",
                "GTE2345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP2nombrechofer="David", numeroplaca="GTE2345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp2Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTE2345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP3nombrechofer="NombreLargoParaChoferA", numeroplaca="GTE2345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp3Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "NombreLargoParaChoferA",
                "GTE2345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP4nombrechofer="David", numeroplaca="GT2345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp4Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GT2345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP5nombrechofer="David", numeroplaca="GTA3345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp5Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP6nombrechofer="David", numeroplaca="GTA23345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp6Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA23345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP7nombrechofer="David", numeroplaca="GTA3345", edad=23,marca=Mazda,área=Norte
    @Test
    public void cp7Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                23,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP8nombrechofer="David", numeroplaca="GTA3345", edad=25,marca=Mazda,área=Norte
    @Test
    public void cp8Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                25,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP9nombrechofer="David", numeroplaca="GTA3345", edad=65,marca=Mazda,área=Norte
    @Test
    public void cp9Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                65,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP10 nombrechofer="David", numeroplaca="GTA3345", edad=26,marca=Mazda,área=Norte
    @Test
    public void cp10Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    //CP11 nombrechofer="David", numeroplaca="GTA3345", edad=26,marca=CUALQUIERA,área=Norte
    @Test
    public void cp11Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "CUALQUIERA",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }


    // CP12 nombrechofer="David", numeroplaca="GTA3345", edad=26,marca=MADZA,área=Norte
    @Test
    public void cp12Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                26,
                "Norte");
        assertTrue(chofer_valido);
    }

    // CP13 nombrechofer="David", numeroplaca="GTA3345", edad=26,marca=MADZA,área=Playas
    @Test
    public void cp13Chofer() {
        boolean chofer_valido = MainActivity.VerificarChofer( "David",
                "GTA3345",
                "Mazda",
                26,
                "Playas");
        assertTrue(chofer_valido);
    }

















}
