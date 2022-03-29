import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }
    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);
        String expected = "La nueva posición de Maria es 1";

        String actual = sut.nuevaPosicionJugador();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void partida_con_solo_un_jugador(){
        Game sut = new Game();
        sut.agregar("María");

        boolean expected = true;
        boolean actual = sut.esJugable();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void partida_con_dos_jugadores(){
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Pepe");

        boolean expected = true;
        boolean actual = sut.esJugable();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void maximo_6_jugadores(){
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Pepe");
        sut.agregar("Raúl");
        sut.agregar("Juan");
        sut.agregar("Estefanía");
        sut.agregar("Lucia");

        boolean expected = true;
        boolean actual = sut.esJugable();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void jugador_sale_de_la_carcel(){
        Game sut = new Game();
        sut.agregar("Luis");
        sut.agregar("Pepe");

        sut.tirarDado(1);
        sut.respuestaIncorrecta();
        sut.tirarDado(1);
        sut.fueRespuestaCorrecta();
        sut.tirarDado(1);

        boolean actual = sut.estaEnLaCarcel("Maria");

        Assertions.assertFalse(actual);
    }
    @Test
    public void si_respuesta_es_incorrecta(){
        Game juego = new Game();
        juego.agregar("Paco");
        juego.agregar("Monica");

        juego.tirarDado(3);

        boolean haGanado = juego.respuestaIncorrecta();

        Assertions.assertFalse(haGanado);
    }
    @Test
    public void sePuedenAcabarLasPreguntas(){
        Game juego = new Game();
        juego.agregar("Raúl");
        juego.agregar("Luís");
        String expected = (String) juego.getPeguntasDeMusica().getFirst();
        juego.tirarDado(1);
        juego.respuestaIncorrecta();
        String actual = (String) juego.getPeguntasDeMusica().getLast();
        Assertions.assertEquals(expected, actual);
    }
}