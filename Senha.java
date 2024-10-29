package programação_java;
import java.util.Scanner;
public class Senha {
	public static void main (String[]arg) {
		Scanner scanner = new Scanner (System.in);
     int senha = 2002;
      for (int i = 1 ; i <= 10;i++) {
    	  System.out.println("digite a senha:");
    	  int x = scanner.nextInt();
    	  if (x != senha) {
    		  System.out.println("senha invalida ");
    		 
    	  }
    	  
    	  else {
    		  System.out.println ("acesso liberado");
    		  break;
    	  }
    			  
   
      }
    
	}

}
