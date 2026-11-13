package taller10;

public class MainTaller10 {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     DEMOSTRACIÓN GENERAL - TALLER 10     ");
        System.out.println("==========================================");

        // Ejercicio 1: Polimorfismo con Persona, Estudiante y Profesor
        System.out.println("\n--- Ejercicio 1: Polimorfismo ---");
        Persona p1 = new Persona("Carlos");
        Persona p2 = new Estudiante("Luis", "Ingeniería de Software");
        Persona p3 = new Profesor("John Carlos", "Programación Orientada a Objetos");

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();

        // Ejercicio 2: Vehículo y Bicicleta
        System.out.println("\n--- Ejercicio 2: Sobrescritura en Vehículos ---");
        Vehiculo vGenerico = new Vehiculo();
        vGenerico.moverse();

        Bicicleta miBici = new Bicicleta();
        miBici.moverse();

        Vehiculo vPolimorfico = new Bicicleta();
        vPolimorfico.moverse();

        System.out.println("\n¡Taller 10 ejecutado con éxito!");
    }
}