package programação_java;
import java.util.Scanner;
public class Maior_Menor {
public static void main (String[]arg) {
	Scanner scanner = new Scanner (System.in);
    System.out.print("Digite o primeiro número: ");
    int numero = scanner.nextInt();

    // O primeiro número será inicialmente o maior e o menor
    int maior = numero;
    int menor = numero;

    // Loop começa a partir do segundo número
    for (int i = 2; i <= 10; i++) {
        System.out.print("Digite o número " + i + ": ");
        numero = scanner.nextInt();

        // Verifica o maior número
        if (numero > maior) {
            maior = numero;
        }

        // Verifica o menor número
        if (numero < menor) {
            menor = numero;
        }
    }

    // Exibe os resultados
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);

  
   }
   
   
   
}

