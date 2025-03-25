import java.util.Scanner;

public class Limite {

    // Função recursiva para calcular o limite
    public static double limite(Funcao f, double x, double epsilon) {
        if (Math.abs(x) < 1e-12) {  // Previne valores muito pequenos >> causa divisão por zero
            return Double.POSITIVE_INFINITY;  // Return infinito quando x é muito pequeno
        }

        double fx = f.calcular(x);

        // para o algoritmo se a != entre os valores sucessivos de f(x) for pequena
        if (Math.abs(fx) < epsilon || Math.abs(fx - f.calcular(x - epsilon)) < epsilon) {
            return fx;
        } else {
            // Recursão para continuar a aproximação, limitando a progressão
            return limite(f, x / 2, epsilon);  // Faz x ir para 0 / por 2
        }
    }

    // Função analisada: f(x) = 1/x
    public static class Funcao {
        public double calcular(double x) {
            if (x == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            return 1 / x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número racional: "); // >> foi aplicada a lógica de limites apenas para o
        // cálculo de número racionais em um primeiro momento. Quem sabe não mudo isso no futuro :P
        double numero = scanner.nextDouble();
        double epsilon = 1e-6;  // Precisão da aproximação

        Funcao f = new Funcao();

        try {
            double resultado = limite(f, numero, epsilon);
            if (resultado == Double.POSITIVE_INFINITY) {
                System.out.println("O limite tende ao infinito.");
            } else {
                System.out.println("Limite de f(x) quando x se aproxima de 0: " + resultado);
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
