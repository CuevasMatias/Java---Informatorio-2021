import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
                new Alumnos("Oliver", "Atom", LocalDate.of(1982, 10, 10)),
                new Alumnos("Benji", "Price", LocalDate.of(1979, 12, 7)),
                new Alumnos("Bruce", "Wayne", LocalDate.of(1915, 4, 17)),
                new Alumnos("Clark", "Kent", LocalDate.of(1938, 4, 18)),
                new Alumnos("Homero", "Simpson", LocalDate.of(1956, 5, 12)));
        Map<String, Integer> alumnosConEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(p-> (p.getNombre() + " " + p.getApellido()),
                                p -> Ejercicio5.getEdad(p.getCumpleanos())));
        System.out.println(alumnosConEdades);
    }

    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
public class Alumnos {
    private String nombre;
    private String apellido;
    private LocalDate cumpleanos;

    public Alumnos(String nombre, String apellido, LocalDate cumpleanos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleanos = cumpleanos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(LocalDate cumpleanos) {
        this.cumpleanos = cumpleanos;
    }
}