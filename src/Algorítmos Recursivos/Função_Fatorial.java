import java.util.Scanner;

public class Função_Fatorial {
    public static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = sc.nextInt();
        int fat = factorial(n);
        System.out.print("Resultado: " + fat);

        sc.close();
    }
}
