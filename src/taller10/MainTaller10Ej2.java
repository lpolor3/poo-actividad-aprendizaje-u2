package taller10;

public class MainTaller10Ej2 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA TALLER 10 - EJERCICIO 2 (VEHÍCULO Y BICICLETA) ===");

        // Instanciando la clase base
        Vehiculo vGenerico = new Vehiculo();
        vGenerico.moverse();

        // Instanciando la clase derivada
        Bicicleta miBici = new Bicicleta();
        miBici.moverse();

        // Demostrando polimorfismo opcional
        Vehiculo vPolimorfico = new Bicicleta();
        vPolimorfico.moverse(); // Ejecuta el método sobrescrito de Bicicleta
    }
}