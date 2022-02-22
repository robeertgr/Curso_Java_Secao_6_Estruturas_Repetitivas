/*
    Um posto de combustíveis deseja determinar qual dos seus produtos tem a preferência dos seus clientes. Escreva
    um algoritmo para ler o tipo do combustível abastecido, codificado da seguinte forma:

    1. Alcool
    2. Gasolina
    3. Diesel
    4. Fim

    Caso o usuário informe um código inválido, deve ser solicitado um novo código até que seja válido.
    O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem
    "Muito obrigado" e a quantidade de clientes que abasteceram cada tipo do combustível
*/

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
        System.out.print("Informe o código: ");
        int codigo = sc.nextInt();

        while (codigo != 4){
            switch (codigo){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.print("Código inválido. Insira um novo código: ");
                    break;
            }
            codigo = sc.nextInt();
        }

        System.out.println("Álcool: " + alcool + "\nGasolina " + gasolina + "\nDiesel " + diesel + "\nObrigado!");

        sc.close();
    }
}
