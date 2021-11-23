import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base;
        int exponente;
        int producto = 0;
        int potencia = 1;

        System.out.print("Por favor, ingrese la base de la potencia: ");
        base = scan.nextInt();
        System.out.print("Ingrese el exponente: ");
        exponente = scan.nextInt();
        scan.close();
        if (exponente == 0) {
            System.out.print(base + " elevado a " + exponente + " = " + 1);
        } else {
            for (int i = 1; i <= exponente; i++) {
                producto = producto + base;

                potencia = potencia * base;
            }
            System.out.print(base + " elevado a " + exponente + " = " + potencia);
        }
    }
}


