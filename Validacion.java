import java.util.Scanner;

public class Validacion {

    String valorOperador;
    double valor1;
    double valor2;
    Scanner scanner;

    public Validacion() {
        this.scanner = new Scanner(System.in);
    }

    //evaluar el string para realizar la operación que corresponde
    public double evaluarOperador() {
        double resultado = 0;
        if (this.valorOperador.equals("+")) {
            resultado = this.valor1 + this.valor2;
        } else if (this.valorOperador.equals("-")) {
            resultado = valor1 - valor2;
        } else if (this.valorOperador.equals("*")) {
            resultado = valor1 * valor2;
        } else if (this.valorOperador.equals("/")) {
            resultado = valor1 / valor2;
        } else if (this.valorOperador.equals("%")) {
            resultado = valor1 % valor2;
        } else if (this.valorOperador.equals("**")) {
            resultado = Math.pow(valor1, valor2);
        }
        return resultado;
    }

    //setters
    public void setValor1() {
        System.out.println("Ingrese un entero: ");
        this.valor1 = scanner.nextInt();
    }

    public void setValor2() {
        System.out.println("Ingrese otro entero: ");
        this.valor2 = scanner.nextInt();
    }

    public void setValorOperador() {
        System.out.println("Ingrese un operador: ");
        this.valorOperador = scanner.next();
        while (!valorOperador.matches("[+\\-*/%]|\\*\\*")) {
            System.out.println("Ingrese un operador válido: ");
            this.valorOperador = scanner.next();
        }
    }

    //cerrar scanner
    public void cerrarScanner() {
        scanner.close();
    }
}
