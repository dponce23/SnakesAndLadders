import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestsUnitarios {
        Jugador jugador = new Jugador('L');

        @DisplayName("Test para comprobar que las escaleras cambian la posicion del jugador correctamente")
        @Test
        public void testComprobarEscaleras() {
            Escaleras escaleras = new Escaleras();


            jugador.posJugador = 1;
            escaleras.comprobarEscalerasYSerpientes(jugador);
            assertEquals(10, jugador.posJugador);

            jugador.posJugador = 20;
            escaleras.comprobarEscalerasYSerpientes(jugador);
            assertEquals(25, jugador.posJugador);

        }

    @DisplayName("Test para comprobar que las serpientes cambian la posicion del jugador correctamente")
    @Test
    public void testComprobarSerpientes() {
        Serpientes serpientes = new Serpientes();

        jugador.posJugador = 15;
        serpientes.comprobarEscalerasYSerpientes(jugador);
        assertEquals(6, jugador.posJugador);

        jugador.posJugador = 34;
        serpientes.comprobarEscalerasYSerpientes(jugador);
        assertEquals(1, jugador.posJugador);

    }

    @DisplayName("Test movimiento del jugador")
    @Test
    public void testMovimientoJugador() {
            jugador.moverJugador(2);
            assertEquals(2,jugador.posJugador);
    }

}

