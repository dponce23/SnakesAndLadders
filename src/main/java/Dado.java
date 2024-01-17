import java.util.Scanner;

public class Dado {
    public int tirada;
    public Dado(){
        this.tirada=0;
    }

    public void tirarDado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione enter para tirar");
        scanner.nextLine();
        tirada=numeroRandomDado();
        System.out.println("Has sacado un "+tirada);
    }

    private int numeroRandomDado(){
        return (int) (Math.random() * 6) + 1;
    }
}
