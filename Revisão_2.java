package programação_java;
import java.util.Scanner;
public class Revisão_2 {
	public static void main (String[]arg) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("digite o numero:");
		int s = scanner.nextInt ();
		
		for (int i=1;i<= s; i++) {
			if (s>=10 && s<=20) {
				System.out.println(s + "dentro");
			}
			else {
				System.out.println(s + "fora");
			}
			
		}
	}

}
