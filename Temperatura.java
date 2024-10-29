package programação_java;
import java.util.Scanner;
public interface Temperatura {
	public static void main (String[]arg) {
	   Scanner scanner = new Scanner (System.in);
	   System.out.println("digite a temperatura:");
	   double Celsius = scanner.nextInt();
	 
	   double F =  Celsius * 1.8 + 32;
	   double K =  Celsius * 273.15;
	   double Re = Celsius * 0.8;
	   double Ra = Celsius * 1.8 + 32 + 459.67;
	   
	   System.out.println("A temperatura em Fahrenheit é:" + F);
	   System.out.println("A temperatura em Kelvin é:" + K);
	   System.out.println("A temperatura em Reaumur  é:" + Re);
	   System.out.println("A temperatura em Rankine é:" + Ra);
	  
	     
	}

}
