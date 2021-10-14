import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> horaTrabajada = new ArrayList<>();
        ArrayList<Integer> valorPorHora = new ArrayList<>();
        ArrayList<Integer> totalDeDia = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();

        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        horaTrabajada.add(6);
        horaTrabajada.add(7);
        horaTrabajada.add(8);
        horaTrabajada.add(4);
        horaTrabajada.add(5);

        totalDeDia.add(horaTrabajada.get(0)*valorPorHora.get(0));
        totalDeDia.add(horaTrabajada.get(1)*valorPorHora.get(1));
        totalDeDia.add(horaTrabajada.get(2)*valorPorHora.get(2));
        totalDeDia.add(horaTrabajada.get(3)*valorPorHora.get(3));
        totalDeDia.add(horaTrabajada.get(4)*valorPorHora.get(4));

        total.add(totalDeDia.get(0)+totalDeDia.get(1)+totalDeDia.get(2)+totalDeDia.get(3)+totalDeDia.get(4));

        System.out.println(totalDeDia);
        System.out.println("Total Final: $ " + total.get(0));

    }
}





