public class Escaleras {
    int[] escaleras = {1,20};

    //Comprueba si la ficha del jugador cae en una casilla de escalera.
    public void comprobarEscaleras(Jugador jugador){
        if (jugador.posJugador == escaleras[0]){
            System.out.println("Perfecto, has caido en una escalera, avanzas hasta la casilla --> 10");
            jugador.posJugador = 10;
        } else if (jugador.posJugador == escaleras[1]) {
            System.out.println("Perfecto, has caido en una escalera, avanzas hasta la casilla --> 25");
            jugador.posJugador = 25;
        }
    }
}
