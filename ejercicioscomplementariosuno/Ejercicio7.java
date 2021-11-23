import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa un oracion: ");
        String oracion = scan.nextLine();
        scan.close();

        char[] ch = oracion.toCharArray();
        for (char e: ch){int value = (int) e;
            if (value >= 97 && value <122){
                value = value -32;
                System.out.print((char) value);}
            else {
                System.out.print((char) value);}
        }
    }
}