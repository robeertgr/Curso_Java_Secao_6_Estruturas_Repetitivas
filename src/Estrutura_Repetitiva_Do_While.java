/*
    Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
    Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite 's', repetir
    o programa.

    Fórmula = F = ((9 * C) / 5) + 32
*/

import java.util.Scanner;

public class Estrutura_Repetitiva_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempFahrenheit;
        char resp;

        do {
            System.out.print("Informe a temperatura em Celsius: ");
            double tempCelsius = sc.nextDouble();

            tempFahrenheit = ((9 * tempCelsius) / 5) + 32;

            System.out.println("Temperatura " + tempCelsius + " C em Fahrenheit: " + tempFahrenheit + " F");
            System.out.print("Gostaria de uma nova conversão? (s/n): ");
            resp = sc.next().charAt(0);
        } while (resp == 's');

        sc.close();
    }
}
