package programação_java;
import java.util.Scanner;
public class calculo_fatorial {
	public static void main (String[]arg) {
		Scanner scanner = new Scanner (System.in);
		  System.out.print("Digite um número inteiro maior que zero: ");
	        int n = scanner.nextInt();
	        
	        if (n > 0) {
	            int fatorial = 1;

	            // Calcula o fatorial usando um loop for
	            for (int i = 1; i <= n; i++) {
	                fatorial *= i;
	            }

	            System.out.println("O fatorial de " + n + " é: " + fatorial);
	        } else {
	            System.out.println("Número inválido. Insira um número maior que zero.");
	        }

		
		
	}

}
