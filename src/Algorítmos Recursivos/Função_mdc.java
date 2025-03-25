import java.util.Scanner;

public class Função_mdc {
    public static int mdc(int n, int m) {
        if (n > m) {
            return mdc(m,n);
        } else {
            if (n==0) {
                return m;
            } else {
                return mdc(n, m%n);
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite 2 números inteiros:");
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println("mdc de "+ n + "," + m + " = " + mdc(n,m));
    sc.close();
    }
}

