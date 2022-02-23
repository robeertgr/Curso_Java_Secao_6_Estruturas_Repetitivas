/*
    Leia 1 valor inteiro N, que representa o número de casos de teste que segue. Cada caso de teste consiste
    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    peso 5.

    6.5 4.3 6.2
    5.1 4.2 8.1
    8.0 9.0 10.0
*/

package Exercicios_For;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media1 = 0;
        double media2 = 0;
        double media3 = 0;

        System.out.print("Informe a quantidade de casos de testes: ");
        int quantidadeTestes = sc.nextInt();

        for (int i = 0; i < quantidadeTestes; i++){
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            if (i == 0){
                media1 = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
            } else if (i == 1){
                media2 = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
            } else if (i == 2){
                media3 = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
            }
        }

        System.out.printf("%.2f\n", media1);
        System.out.printf("%.2f\n", media2);
        System.out.printf("%.2f", media3);

        sc.close();
    }
}
