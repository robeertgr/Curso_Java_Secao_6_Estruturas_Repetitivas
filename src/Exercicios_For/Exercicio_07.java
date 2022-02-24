/*
    Fazer um programa para ler um número inteiro N. O programa deve então mostrar na tela N linhas,
    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.
*/

package Exercicios_For;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++){
            System.out.println("" + i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }

        sc.close();
    }
}
