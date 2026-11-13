package taller9;

public class UsoIncorrectoSuper {
    private String mensaje = "Hola";

    public void probarSuper() {
        // ERROR DE COMPILACIÓN: UsoIncorrectoSuper no extiende de ninguna clase
        // System.out.println(super.mensaje);
    }
}
