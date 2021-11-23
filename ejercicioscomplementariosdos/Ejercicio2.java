import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer numero,numero2,numero3;
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese numero " + i + ":");
            numero = scan.nextInt();
            numeros.add(numero);
        }
        System.out.println(numeros);
        System.out.println("Largo de la lista: "+numeros.size());

        System.out.print("Ingrese el elemento que quiere agregar al inicio: ");
        numero2 = scan.nextInt();
        numeros.add(0,numero2);
        System.out.print("Ingrese el elemento que quiere agregar al final: ");
        numero3 = scan.nextInt();
        numeros.add(numero3);
        scan.close();

        System.out.println(numeros);
        System.out.println("Largo de la lista: "+numeros.size());

    }
}

