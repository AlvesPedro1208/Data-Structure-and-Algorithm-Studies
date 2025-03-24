public class Exec01 {
    // F(int n) receberá sempre um único valor de entrada de dados, o que faz com que ela realize um número fixo de
    // operações matemáticas, independente do valor de n, no fim de tudo é apenas 1 entrada e 1 saída.
    // Complexidade Big O >> O(1)
    public static double f(int n) {
        return (Math.pow(n, 3)/1000) - (100 * Math.pow(n, 2)) - (100 * n) + 3;
    }
    // A função main() apenas inicializa a variável n e chama a função f(n), além de imprimir o resultado.
    // Todas essas operações ocorrem em tempo constante.
    // Complexidade: O(1)
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Result da função f(" + n + ") = " + f(n));
    }
}
// Complexidade Final do Algoritmo >> Big 0(1)