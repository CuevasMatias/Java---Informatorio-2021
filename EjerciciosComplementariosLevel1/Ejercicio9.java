import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String oracion;
        String caracter;
        int cont = 0;

        System.out.print("Ingrese frase u oracion; ");
        oracion = scan.nextLine();
        System.out.print("Ingrese caracter que desea contar: ");
        caracter = scan.nextLine();
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == caracter.charAt(0)) {
                cont++;
            }
        }
        if (cont != 0) {
            System.out.println(cont);
        } else {
            System.out.println("El caracter no se encuentra");
        }
    }
}