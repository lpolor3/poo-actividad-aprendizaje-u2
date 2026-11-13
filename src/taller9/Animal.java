package taller9;

public class Animal {
    protected String especie;

    // Constructor de la clase base
    public Animal(String especie) {
        this.especie = especie;
    }

    // Método de la clase base
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
