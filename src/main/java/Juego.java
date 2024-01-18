
public class Juego {
    public static void main(String[] args) {
        boolean ganador=false;
        int turnoJugador=0;
        Tablero t = new Tablero();
        Dado d = new Dado();
        Escaleras e = new Escaleras();
        Serpientes s = new Serpientes();
        Jugador J1 = new Jugador('X');
        Jugador J2 = new Jugador('Z');
        t.mensajeBienvenida();
        t.dibujarTablero(J1,J2);

        //Un bucle que termina cuando el booleano ganador tenga valor true
        while (!ganador){
            if (turnoJugador==0){
                System.out.println("Es tu turno Jugador "+ J1.fichaJugador);
                d.tirarDado();
                J1.moverJugador(d.tirada);
                e.comprobarEscaleras(J1);
                s.comprobarserpientes(J1);
            }else{
                System.out.println("Es tu turno Jugador "+ J2.fichaJugador);
                d.tirarDado();
                J2.moverJugador(d.tirada);
                e.comprobarEscaleras(J2);
                s.comprobarserpientes(J2);
            }
            t.dibujarTablero(J1,J2);
            if (J1.posJugador > 35 ){
                System.out.println("Enhorabuena jugador "+J1.fichaJugador+" has ganado la partida");
                ganador = true;
            }else if (J2.posJugador > 35 ){
                System.out.println("Enhorabuena jugador "+J2.fichaJugador+" has ganado la partida");
                ganador = true;
            }
            turnoJugador=cambiarTurno(turnoJugador);
        }

    }

    //Cambia el turno entre el jugador 1 y el jugador 2

    public static int cambiarTurno(int turnoActual){
        if (turnoActual == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
