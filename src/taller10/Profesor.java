package taller10;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, String asignatura) {
        super(nombre);
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " y dicto la asignatura de " + asignatura + ".");
    }
}
