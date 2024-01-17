public class Tablero {
    private final int[][]  posicionesTablero = new int[6][6];

    public void dibujarTablero(Jugador jugador1, Jugador jugador2){
        System.out.println("--------------------------------");
        int casillas=0;
        for (int i =0; i< posicionesTablero.length;i++){
            for (int j = 0;j < posicionesTablero.length;j++){
                comprobarPosicionJugador(casillas,jugador1,jugador2);
                casillas++;
            }
            System.out.println();
        }
    }

    private void comprobarPosicionJugador(int casilla, Jugador jugador1, Jugador jugador2){
        if (jugador1.posJugador == casilla && jugador2.posJugador == casilla) {
            System.out.print(" "+jugador1.fichaJugador + "" + jugador2.fichaJugador);
        }else if(jugador1.posJugador == casilla){
            System.out.print(" "+jugador1.fichaJugador+jugador1.fichaJugador);
        } else if (jugador2.posJugador == casilla){
            System.out.print(" "+jugador2.fichaJugador+jugador2.fichaJugador);
        } else{
            if (casilla < 10){
                System.out.print(" 0"+casilla);
            }else{
                System.out.print(" "+casilla);
            }

        }
    }
    public void mensajeBienvenida(){
        System.out.println("Bienvenidos al juego de Snakes&Ladders creado por Diego Ponce");
        System.out.println("El juego es por turnos y las reglas son las siguientes:");
        System.out.println("1-Hay una serie de escaleras que te hacen avanzar posiciones " +
                "y serpientes que te hacen retrasar posiciones");
        System.out.println("2-Tirar el dado para avanzar casillas");
        System.out.println("3-El primer jugador que supere la casilla 35 será el ganador del juego");
        System.out.println("¡¡¡Mucha suerte Jugadores!!!");

    }
}
