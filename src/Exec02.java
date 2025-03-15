//Dessa vez realizei o estudo definindo uma função logaritmica e realizando a analise de complexidade computacional na mesma.

public class Exec02 {
    // A função f(int n) recebe sempre um único valor de entrada e realiza um número fixo de operações matemáticas,
    // independentemente do valor de n. Como não há laços ou chamadas recursivas, a função sempre executa em tempo constante.
    // Complexidade: O(1)
    public static double f(int n){
        return (Math.log(n)*5) + n;
    }
    // A função main apenas permanece como no exemplo anterior
    // Complexidade Big O >> O(1)
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Result da função f(" + n + ") = " + f(n));
    }
}
// Complexidade Final do Algoritmo >> Big 0(1)