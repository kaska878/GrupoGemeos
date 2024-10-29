package programação_java;
import java.util.Scanner;
public class Numeros_pares {
	public static void main (String[]arg) {
	  Scanner scanner = new Scanner (System.in);
	int soma = 0 ;
	int quantidade = 0;
	for (int i = 13; i <= 73; i += 2 ) {
		soma += i;
		quantidade++;
		double media = (double) soma / quantidade;
		System.out.println("quntidade de números pares:" + quantidade);
		System.out.println("soma total dos números pares:" + soma );
		System.out.println("média aritmética dos números pares:" + media);
	}
	}

}
