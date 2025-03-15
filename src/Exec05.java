// Analise de complexidade computacional de um laço exponencial

public class Exec05 {
    public static void main(String[] args) {
        int n = 10;
        // Diferente do caso do Exec03, onde o índice era incrementado linearmente (i++), aqui existe uma pequena diferença.
        // Toda vez que o looping roda, ele dobra o indice. O i é inversamente proporcial a quantidade de repetições, pois
        // ele precisa cumprir a regra de ser menor que n. Portanto, sempre que i *= 2 o tempo de processamento t/2.
        // Podemos dizer que o número de iterações é proporcional ao log₂(n), pois i segue a sequência:
        // 1, 2, 4, 8, 16, ..., até alcançar ou ultrapassar n.

        // A cada iteração, o valor de i cresce exponencialmente, reduzindo o número de passos necessários
        // para atingir n.
        // Complexidade Big O >> O(n log n)
        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }
    }
}
// Complexidade Final do Algoritmo >> O(n log n)