import java.util.*;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        Integer numero = scan.nextInt();
        Integer factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        scan.close();
    }
}