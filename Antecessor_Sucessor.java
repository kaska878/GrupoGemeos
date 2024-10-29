package programação_java;
import java.util.Scanner;
public class Antecessor_Sucessor {
	public static void main (String[]arg) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("digite um numero:");
		int x = scanner.nextInt();
		
		int Antecessor = x - 1 ;
		int sucessor = x + 1 ;
		
		System.out.println("antecessor = " + Antecessor);
		System.out.println("sucessor = " + sucessor);
	}

}
