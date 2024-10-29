package programação_java;
import java.util.Scanner;
public class Saudo_com_Reajuntes {
	public static void main (String[]arg) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("digite um numero:");
		int x = scanner.nextInt();
		 
		int resultado = x /100 + x;
		
		 System.out.println(resultado);
	}

}
