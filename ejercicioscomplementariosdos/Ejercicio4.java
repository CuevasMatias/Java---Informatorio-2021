import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String alumno;
        ArrayList<String> listado = new ArrayList<>();
        Scanner scan= new Scanner(System.in);

        for (int i = 0; i <= 12; i++) {
            System.out.print("Ingrese nombre del alumno " + i + ":");
            alumno = scan.nextLine();
            listado.add(alumno);
        }
        scan.close();
        List curso1= listado.subList (0,4);
        List curso2= listado.subList (4,8);
        List curso3= listado.subList (8,13);

        System.out.println("Curso:1 " + curso1);
        System.out.println("Curso:2 " + curso2);
        System.out.println("Curso:3 " + curso3);

    }
}