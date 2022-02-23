/*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão no intervalo [10, 20] e quantos estão fora do intevalo, mostrando
    essas inforações conforme exemplo (use a palavra "in" para dentro e "out" para fora do intervalo)
*/

package Exercicios_For;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.print("Informe uma quantidade de números a serem lidos: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++){
            System.out.print("Informe um número: ");
            int numero = sc.nextInt();

            if (numero >= 10 && numero <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in\n" + out + " out");

        sc.close();
    }
}
