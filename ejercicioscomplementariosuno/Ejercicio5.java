import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro;
        int nro2;
        int producto = 0;

        System.out.print("Por favor, ingrese multiplicando: ");
        nro = scan.nextInt();
        System.out.print("Ingrese multiplicador: ");
        nro2 = scan.nextInt();
        scan.close();
        if (nro2 == 0)
        { System.out.print(nro + " x " + nro2 + " = " + 0);}
        else if (nro2 == 1)
        { System.out.print(nro + " x " + nro2 + " = " + nro);}
        else {
        for (int i = 1; i <= nro2; i++){
            producto = producto + nro;
        }
        System.out.print(nro + " x " + nro2 + " = " + producto);}
    }
}