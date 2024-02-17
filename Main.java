
public class Main {
    public static void main(String[] args) {

        Validacion validacion = new Validacion();
        validacion.setValor1();
        validacion.setValor2();
        validacion.setValorOperador();

        double resultado = validacion.evaluarOperador();
        System.out.println("El resultado es: " + resultado);
        validacion.cerrarScanner();
    }
}