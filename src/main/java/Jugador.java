public class Jugador {
    public int posJugador;
    public char fichaJugador;

    public Jugador(char fichaJugador){
        this.posJugador = 0;
        this.fichaJugador=fichaJugador;

    }

    public void moverJugador(int cantidadDePasos){
        this.posJugador += cantidadDePasos;

    }
}
