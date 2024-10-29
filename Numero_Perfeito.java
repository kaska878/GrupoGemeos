package programação_java;
import java.util.Scanner;
public class Numero_Perfeito {
	public static void main (String[]arg) {
	  Scanner scanner = new Scanner (System.in);
	  // Solicita ao usuário que insira um número
      System.out.print("Digite um número: ");
      int numero = scanner.nextInt();
      
      // Variável para armazenar a soma dos divisores próprios
      int somaDivisores = 0;

      // Laço que verifica todos os divisores do número
      for (int i = 1; i <= numero / 2; i++) {
          if (numero % i == 0) {
              somaDivisores += i;
          }
      }

      // Verifica se a soma dos divisores é igual ao número
      if (somaDivisores == numero) {
          System.out.println(numero + " é um número perfeito.");
      } else {
          System.out.println(numero + " não é um número perfeito.");
      }
	   
	}

}
