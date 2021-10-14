import java.util.*;

public class Ejercicio3 {
        public static void main(String[] args) {
                ArrayList<String> mazo = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                        mazo.add(i + " de Corazon");
                }
                for (int i = 1; i <= 10; i++) {
                mazo.add(i + " de Diamantes");
                }
                for (int i = 1; i <= 10; i++) {
                mazo.add(i + " de Trebol");
                }
                for (int i = 1; i <= 10; i++) {
                mazo.add(i + " de Picas");
                }
                System.out.println(mazo);
                System.out.println("Al reves");
                Collections.reverse(mazo);
                for (int i = 0; i <mazo.size() ; i++) {
                        System.out.print(mazo.get(i)+",");
                }
                System.out.println("Mezclado");
                Collections.shuffle(mazo);
                for (int j = 0; j <mazo.size() ; j++) {
                        System.out.print(mazo.get(j)+",");
                }
        }
}