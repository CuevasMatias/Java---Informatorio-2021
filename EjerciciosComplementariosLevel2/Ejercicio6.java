import java.util.*;

public class Ejercicio6{
    public static void main(String[] args) {

        Set<Empleado> lista = new HashSet<>();
        HashMap<Integer, Integer> listado = new HashMap <>();
        lista.add(new Empleado("Carlos Gomez", 17346220, 8, 350));
        lista.add(new Empleado("Juan Carlos", 20346220, 9, 400));
        lista.add(new Empleado("Maria Gonzales", 25346220, 7, 300));

        System.out.println("Lista de los empleados");

        for (Empleado nun: lista) {
            System.out.println(nun.getNombreYApellido()+ " - DNI: " + nun.getDni()+ " - Horas de trabajo: " + nun.getHorasTrabajadas()+ " - Valor por hora: " + nun.getValorPorHoras());
        }

        for (Empleado  zz: lista) {
            listado.put(zz.getDni(), zz.sueldo());
        }
        System.out.println("Salario percibido:");
        listado.forEach((dni, sueldo) -> System.out.println("DNI:" + dni + " - Salario:" + sueldo));
    }

    }


public class Empleado{

    private String nombreYApellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHoras;

    public Empleado(String nombreYApellido, int dni, int horasTrabajadas, int valorPorHoras ){
        this.nombreYApellido=nombreYApellido;
        this.dni=dni;
        this.horasTrabajadas=horasTrabajadas;
        this.valorPorHoras=valorPorHoras;
    }
    public String getNombreYApellido(){return this.nombreYApellido;}
    public int getDni(){return this.dni;}
    public int getHorasTrabajadas(){return this.horasTrabajadas;}
    public int getValorPorHoras(){return this.valorPorHoras;}

    public int sueldo() {
        return ((this.horasTrabajadas) * (this.valorPorHoras));}

    @Override
    public String toString(){
        return this.nombreYApellido+ " " + String.valueOf(this.dni)+ " "+ String.valueOf(this.horasTrabajadas)+ " "+ String.valueOf(this.valorPorHoras);
    }

}

