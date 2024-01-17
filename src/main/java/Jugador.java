public class Jugador {
    public int posJugador;
    public char fichaJugador;

    public Jugador(char fichaJugador){
        this.posJugador = 0;
        this.fichaJugador=fichaJugador;

    }

    //Recibe las posiciones que debe avanzar y se las añade a la posición del jugador
    public void moverJugador(int cantidadDePasos){
        this.posJugador += cantidadDePasos;

    }
}
