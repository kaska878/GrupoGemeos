// Dupla: João e Pedro , Lorena e Natielle 

import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_sorteado = 80; 
        System.out.println("Digite um número inteiro de 1 a 100!");
        System.out.println("Você tem 7 tentativas.");

        boolean acertou = false;

        for (int i = 1; i <= 7; i++) {
            System.out.print(+ i + "- Digite um número: ");
            int numero_pessoal = scanner.nextInt();

            if (numero_sorteado > numero_pessoal) {
                System.out.println("O número sorteado é maior.");
            } else if (numero_sorteado < numero_pessoal) {
                System.out.println("O número sorteado é menor.");
            } else {
                System.out.println("Você acertou! Parabéns!");
                acertou= true;
                break;
            }
        }

        if (!acertou) {
            System.out.println("Sua chance foi esgotada!, tente novamente.");
        }
    }
}
