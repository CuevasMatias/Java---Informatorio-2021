import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudadesFavoritas = new ArrayList<>();
        System.out.print("Ingrese su primera ciudad favorita: ");
        String ciu1 = scan.nextLine();
        ciudadesFavoritas.add("1 - " +ciu1);
        System.out.print("Ingrese su segunda ciudad favorita: ");
        String ciu2 = scan.nextLine();
        ciudadesFavoritas.add("2 - "+ ciu2);
        System.out.print("Ingrese su tercera ciudad favorita: ");
        String ciu3 = scan.nextLine();
        ciudadesFavoritas.add("3 - "+ciu3);
        scan.close();

        for (int i = 0; i < ciudadesFavoritas.size(); i++) {
            System.out.println("#"+ (ciudadesFavoritas.get(i)));
        }
    }
}

