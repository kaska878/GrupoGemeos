package programação_java;
import java.util.Scanner; 
public class Revisão {
	public static void main (Scanner[]arg) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("digite um numero inteiro de 1 a 1000");
		int x = scanner.nextInt ();
		if (x<1 && x>1000) {
			System.out.println("tente novamente");
		}
		else for (int i = 1; i< x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		}

}