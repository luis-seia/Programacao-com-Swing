package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
	
		System.out.println(" insora o primeiro numero");
		int n = scan.nextInt();
		System.out.println(" insora segundo numero numero");
		int k = scan.nextInt();
		
		int p = k+n;
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			//yue.printStackTrace();
		}
		
	}

}
