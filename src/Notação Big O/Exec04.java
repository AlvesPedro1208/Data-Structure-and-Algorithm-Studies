// Analise de complexidade computacional de uma matriz

public class Exec04 {

    public static void main(String[] args) {
        int n = 10;

        // Como visto no exemplo anterior, o laço for possuí uma complexidade O(n), pois o número de iterações do loop
        // é proporcional ao valor de n.
        // Complexidade Big O >> O(n)
        for (int i = 0; i < n; i++) {
            // Assim como no looping, anterior, esse looping que percorre a quantidade de colunas da matriz quadratica é
            // proporcional a n para cada iteração do primeiro loop.
            // Complexidade Big O >> O(n)
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
// O(n) * O(n) = O(n^2)
// Complexidade Final do Algoritmo >> O(n^2)