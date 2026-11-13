package taller9;

public class Empleado extends Persona {
    private String departamento;

    // Constructor que usa super() para inicializar los atributos del padre
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    // Sobrescritura del método usando super.mostrarDetalles()
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Invoca el método de la clase Persona
        System.out.println("Departamento: " + departamento);
    }
}
