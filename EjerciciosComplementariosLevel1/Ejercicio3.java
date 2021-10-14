import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro;
        System.out.print("Por favor, ingrese un numero: ");
        nro = scan.nextInt();

        for (int i=1; i<=nro; i++) {
            System.out.println("");
            for(int elevar=1; elevar<=i; elevar++){
                System.out.print(elevar);
            }
        }
        System.out.println("");
    }
}

