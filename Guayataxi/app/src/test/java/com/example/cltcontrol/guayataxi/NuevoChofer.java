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
        boolean chofer_valido = MainActivity.VerificarChofer("Luis Zuniga",
                                                             "GYZ1234",
                                                             "Nissan",
                                                             25,
                                                             "Samborondon");
        assertTrue(chofer_valido);
    }

    @Test
    public void sueldoChoferJoven() {
        double sueldo_taxista = MainActivity.CalcularSueldoChofer("GYZ1234",
                                                                  25,
                                                                  "Samborondon");
        assertEquals(300, sueldo_taxista, 2);
    }

    /*
    * El nombre no puede incluir números o caracteres especiales (excepto espacios).
    * Mín: 5 y máx: 20 (letras).
    * */
    @Test
    public void choferInvalidoNumero() {
        boolean chofer_valido = MainActivity.VerificarChofer(
                "Juan Zambrano25",
                "GYZ1234",
                "Nissan",
                25,
                "Samborondon");

        assertFalse(chofer_valido);
    }

    @Test
    public void choferInvalidoCaracterEspecial() {
        boolean chofer_valido = MainActivity.VerificarChofer(
                "Juan Zambrano@",
                "GYZ1234",
                "Nissan",
                25,
                "Samborondon");

        assertFalse(chofer_valido);
    }

    /*
    * 3 letras y 4 números. La primera letra indica la provincia.
    * */
    @Test
    public void placaInvalidaNumeroExtra() {
        boolean chofer_placa_invalida = MainActivity.VerificarChofer(
                "Juan Zambrano",
                "GYZ01234",
                "Nissan",
                25,
                "Samborondon");

        assertFalse(chofer_placa_invalida);
    }

    @Test
    public void placaInvalidaLetraExtra() {
        boolean chofer_placa_invalida = MainActivity.VerificarChofer(
                "Juan Zambrano",
                "GYZD1234",
                "Nissan",
                25,
                "Samborondon");

        assertFalse(chofer_placa_invalida);
    }

    @Test
    public void placaInvalidaOtraProvincia() {
        boolean chofer_placa_invalida = MainActivity.VerificarChofer(
                "Juan Zambrano",
                "IYZ2234",
                "Nissan",
                25,
                "Samborondon");

        assertFalse(chofer_placa_invalida);
    }

    /*
    * Por estándar de calidad solo se permiten las siguientes marcas de auto:
    * Nissan, General Motors, Honda, Toyota, KIA, Mazda.
    * */
    @Test
    public void marcaCarroInvalida() {
        boolean chofer_placa_invalida = MainActivity.VerificarChofer(
                "Juan Zambrano",
                "GYZ1234",
                "Chevrolet",
                25,
                "Samborondon");

        assertFalse(chofer_placa_invalida);
    }

    /*
    * Los choferes con edad mayores a 50 años tiene un bono de $50 mensuales
    * */
    @Test
    public void sueldoChoferViejoAreaNorte() {
        double sueldo = MainActivity.CalcularSueldoChofer(
                "GYZ1234",
                55,
                "Norte");

        assertEquals(350, sueldo, 2);
    }

    @Test
    public void sueldoChoferViejoAreaSambo() {
        double sueldo = MainActivity.CalcularSueldoChofer(
                "GYZ1234",
                55,
                "Samborondon");

        assertEquals(320, sueldo, 2);
    }

    /*
    * GT solo contrata choferes con experiencia que estén entre las edades 25 y 65
    * */
    @Test
    public void choferInvalidoMuyJoven() {
        boolean chofer_placa_invalida = MainActivity.VerificarChofer(
                "Juan Zambrano",
                "GYZ1234",
                "Nissan",
                20,
                "Samborondon");

        assertFalse(chofer_placa_invalida);
    }

    @Test
    public void choferInvalidoMuyViejo() {
        boolean chofer_placa_invalida = MainActivity.VerificarChofer(
                "Juan Zambrano",
                "GYZ1234",
                "Nissan",
                70,
                "Samborondon");

        assertFalse(chofer_placa_invalida);
    }

}
