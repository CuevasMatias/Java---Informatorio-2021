import java.util.*;

public class Ejercicio8{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre y Apellido: ");
        String nombreApellido = scan.nextLine();
        System.out.print("Ingrese su edad: ");
        String edad = scan.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = scan.nextLine();
        System.out.print("Ingrese su ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido);
    }
}