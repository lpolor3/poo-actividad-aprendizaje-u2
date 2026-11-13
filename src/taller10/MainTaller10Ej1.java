package taller10;

public class MainTaller10Ej1 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA TALLER 10 - EJERCICIO 1 (POLIMORFISMO) ===");

        // Aplicando polimorfismo: Referencia de la clase padre apuntando a objetos hijos
        Persona p1 = new Persona("Carlos");
        Persona p2 = new Estudiante("Luis", "Ingeniería de Software");
        Persona p3 = new Profesor("John Carlos", "Programación Orientada a Objetos");

        // Invocando el método presentarse (se ejecuta la versión sobrescrita según el objeto real)
        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}
