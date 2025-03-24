import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fila_Paciente {

    private static class NO{
        public  String dado;
        public  NO prox;
    }

    private static NO ini;
    private static NO fim;

    private static class RetornoP{
        public  String item;
        public  boolean ok;
    }

    public void INIT() {
        ini = null;
        fim = null;
    }

    public boolean IsEmpty() {
        return (ini == null && fim == null);
    }

    public void ENQUEUE(String item) {
        NO novo = new NO();
        novo.dado = item;
        novo.prox = null;
        if (IsEmpty())
            ini = novo;
        else
            fim.prox = novo;
        fim = novo;
    }

    public RetornoP DEQUEUE() {
        RetornoP saida = new RetornoP();
        if(!IsEmpty()) {
            saida.item = ini.dado;
            ini = ini.prox;
            if (ini == null) fim = null;
            saida.ok = true;
        }
        else
            saida.ok = false;
        return saida;
    }


    public static void main(String[] args) throws IOException {

        // Instacia a fila de pacientes
        Fila_Paciente fila = new Fila_Paciente();
        RetornoP resultado = new RetornoP();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner entrada = new Scanner(System.in);

        int opcao;

        // Fila inicia vazia
        fila.INIT();

        // Menu para similar entrada e saída de pacientes em uma
        // fila em um consultório médico
        do {
            System.out.println("1 - Insere paciente na fila de espera  ");
            System.out.println("2 - Chama cliente para atendimento  ");
            System.out.println("3 - Sair - apenas se não houver mais cliente na fila ");
            opcao=entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite nome do paciente ");
                    String item= in.readLine();
                    fila.ENQUEUE(item);
                    break;
                case 2:
                    resultado = fila.DEQUEUE();
                    if (resultado.ok)
                        System.out.println("Cliente Chamado: "+ resultado.item);
                    break;
                case 3:
                    if (!fila.IsEmpty()) {
                        opcao = 4;
                        System.out.println("Não pode encerrar, pois há clientes na fila ");
                    }
                    break;
                default:
                    System.out.println("Opção inválida ");
            }
        }while (opcao !=3);
        entrada.close();
    }
}