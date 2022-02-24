/*
    Ler um número inteiro N e calcular todos os seus divisores
*/

package Exercicios_For;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                System.out.println("" + numero + " é dividido por " + i);
            }
        }

        sc.close();
    }
}
