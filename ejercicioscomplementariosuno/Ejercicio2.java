import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro;
        int nro2;

        System.out.print("Por favor, ingrese un numero: ");
        nro = scan.nextInt();
        System.out.print("Ingrese segundo numero: ");
        nro2 = scan.nextInt();
        scan.close();
        int nro3 = (nro + nro2);
        System.out.println(nro + " + "+ nro2 + " = " + nro3);
        int nro4 = (nro - nro2);
        System.out.println(nro + " - "+ nro2 + " = " + nro4);
        int nro5 = (nro * nro2);
        System.out.println(nro + " * "+ nro2 + " = " + nro5);
        int nro6 = (nro / nro2);
        System.out.println(nro + " / "+ nro2 + " = " + nro6);
        int nro7 = (nro % nro2);
        System.out.println(nro + " % "+ nro2 + " = " + nro7);
    }
}