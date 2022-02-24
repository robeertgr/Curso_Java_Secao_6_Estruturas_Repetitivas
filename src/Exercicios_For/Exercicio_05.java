/*
    Ler um valor N. Calcular e escrever o seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ...
    Lembrando que, por definição, o fatorial de 0 é 1.
*/

package Exercicios_For;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fat = 1;

        System.out.print("Informe o número a saber o fatorial: ");
        double numeroFatorial = sc.nextDouble();

        for (int i = 1; i <= numeroFatorial; i++){
            fat = fat * i;
        }

        System.out.println("Fatorial de " + numeroFatorial + " é " + fat);

        sc.close();
    }
}
