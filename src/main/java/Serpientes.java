public class Serpientes implements Comprobaciones {
    int[] serpientes = {15, 34};

    //Comprueba si la ficha del jugador cae en una casilla de serpiente.
    public void comprobarEscalerasYSerpientes(Jugador jugador) {
        if (jugador.posJugador == serpientes[0]) {
            System.out.println("OH OH, has caido en una serpiente =(, retrocedes hasta la casilla --> 6");
            jugador.posJugador = 6;
        } else if (jugador.posJugador == serpientes[1]) {
            System.out.println("Tienes muy mala suerte..., has caido en la peor serpiente, retrocedes hasta la casilla -->¡¡ 1 !!");
            jugador.posJugador = 1;
        }
    }
}
