package programação_java;
import java.util.Scanner;
public class Media_Salarial {
	public static void main (String[]arg) {
		Scanner scanner = new Scanner (System.in);
		   System.out.print("Digite o número de funcionários: ");
	        int numFuncionarios = scanner.nextInt();

	        double somaSalarios = 0;

	        // Coletar salários e calcular a soma ao mesmo tempo
	        for (int i = 1; i <= numFuncionarios; i++) {
	            System.out.print("Digite um salario: " + i + ": ");
	            somaSalarios += scanner.nextDouble();
	        }

	        // Calcular e exibir a média salarial
	        double mediaSalarial = somaSalarios / numFuncionarios;
	        System.out.printf("A média salarial é: R$ %.2f%n", mediaSalarial);

	        scanner.close();

	}

}
