// Para esse exercicio foi proposto analisar a complexidade do algoritmo

public class Exec03 {
    public static void main(String[] args) {
        int n = 10;
        // O número de iterações do loop é proporcional ao valor de n, ou seja, a cada aumento de n, o tempo de
        // execução cresce linearmente (Semelhante a funções afim f(x) = a.x +b).
        // Complexidade Big O >> O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}

// Complexidade Final do Algoritmo >> Big 0(n)