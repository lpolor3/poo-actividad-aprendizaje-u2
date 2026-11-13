package taller9;

// Clase Base con un atributo privado
class BasePrivada {
    private String secreto = "Dato privado";
}

// Clase Derivada en el mismo archivo
public class PruebaErrorSuper extends BasePrivada {
    public void intentarAcceso() {
        // ERROR DE COMPILACIÓN que el profesor quiere que observes:
        // System.out.println(super.secreto);
    }
}
