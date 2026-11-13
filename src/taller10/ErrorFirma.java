package taller10;

class BasePruebaError {
    public void mostrarMensaje(int codigo) {
        System.out.println("Código: " + codigo);
    }
}

public class ErrorFirma extends BasePruebaError {

    /*
     * ERROR DE COMPILACIÓN ESPERADO:
     * Al cambiar el parámetro (de int a String) y usar @Override,
     * Java genera el error: "Method does not override method from its superclass"
     *
     * @Override
     * public void mostrarMensaje(String codigoTexto) {
     *     System.out.println("Texto: " + codigoTexto);
     * }
     */
}