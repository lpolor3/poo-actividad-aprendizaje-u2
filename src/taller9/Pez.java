package taller9;

public class Pez extends Animal {
    private String tipoDeAgua;

    // Constructor que utiliza super() para invocar el constructor de Animal
    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    // Sobrescritura utilizando super.mostrarEspecie()
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Invoca el método de la clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}