/*
    Escreva um programa que repita a leitura de uma senha até ela ser válida. Para cada leitura de senha
    incorreta informada, escrever a mensagem "Senha inválida". Quando a senha for informada corretamente deve ser
    impressa a mensagem "Acesso permitido" e o algoritmo encerrado. Considere a senha correta o valor 2022.
*/

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a senha em numérico: ");
        int senha = sc.nextInt();

        while (senha != 2022){
            System.out.print("Senha " + senha + " inválida!\nInforme a senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Liberado!\nSenha " + senha + " correta.");

        sc.close();
    }
}
