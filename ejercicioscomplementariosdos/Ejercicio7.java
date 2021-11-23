import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        int numero1, numero2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese primer valor: ");
        numero1 = scan.nextInt();
        System.out.print("Ingrese primer valor: ");
        numero2 = scan.nextInt();


        String[] inv = new String[numero2 - numero1];
        int i = 0;
        inv[i] = numero1 + "";
        inv[numero2 - numero1 - 1] = (numero2 - 1) + "";

        i = i + 1;

        for (int z = numero1 + 1; z < numero2; z++) {
            if (multiploDe2(z) == true) {
                inv[i] = "Fizz";
            }
            if (multiploDe3(z) == true) {
                inv[i] = "Buzz";
            }
            if (multiploDe2(z) == true & multiploDe3(z) == true) {
                inv[i] = "Fizz Buzz";
            }
            if (multiploDe2(z) == false & multiploDe3(z) == false) {
                inv[i] = i + "";
            }
            i = i + 1;
        }
        for (int x = 0; x < inv.length; x++) {
            System.out.print(inv[x] + " ");
        }
        scan.close();
    }


    public static boolean multiploDe2(int numero) {
        return (numero % 2 == 0);
    }

    public static boolean multiploDe3(int numero) {
        return (numero % 3 == 0);
    }
}
