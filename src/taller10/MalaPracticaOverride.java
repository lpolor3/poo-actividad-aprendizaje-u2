package taller10;

class OperacionBase {
    public void calcular() {
        System.out.println("Calculando operación base...");
    }
}

public class MalaPracticaOverride extends OperacionBase {

    // Sin @Override: Si por error escribimos mal el nombre del método (ej. "calula" en vez de "calcular"),
    // Java NO genera error de compilación; en su lugar, creará un método nuevo
    // en vez de sobrescribir el original, lo que genera errores lógicos difíciles de detectar.
    public void calula() {
        System.out.println("Método con error tipográfico sin @Override");
    }
}