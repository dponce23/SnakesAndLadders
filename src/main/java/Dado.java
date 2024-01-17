import java.util.Scanner;

public class Dado {
    public int tirada;
    public Dado(){
        this.tirada=0;
    }

    //Simula la accion de tirar un dado, y cuando reciba una pulsacion de la tecla "ENTER" realiza la tirada
    public void tirarDado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione enter para tirar");
        scanner.nextLine();
        tirada=numeroRandomDado();
        System.out.println("Has sacado un "+tirada);
    }

    //Decuelve un numero entre 1 y 6 para usarlo en el metodo tirarDado
    private int numeroRandomDado(){
        return (int) (Math.random() * 6) + 1;
    }
}
