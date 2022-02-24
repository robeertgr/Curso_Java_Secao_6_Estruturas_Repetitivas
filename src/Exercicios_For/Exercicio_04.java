/*
    Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossível"
*/

package Exercicios_For;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numerador;
        double denominador;
        double total;

        System.out.print("Quantas repetições? ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++){
            System.out.print("Numerador: ");
            numerador = sc.nextDouble();
            System.out.print("Denominador: ");
            denominador = sc.nextDouble();

            if (denominador == 0){
                System.out.println("Divisão impossível");
            }

            total = numerador / denominador;

            System.out.println("Resultado: " + total);
        }

        sc.close();
    }
}
