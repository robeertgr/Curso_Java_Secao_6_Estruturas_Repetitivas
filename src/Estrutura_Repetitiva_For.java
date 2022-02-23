import java.util.Scanner;

public class Estrutura_Repetitiva_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}
