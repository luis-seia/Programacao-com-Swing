package numero2;

public class Number {
	public static void main(String args[]) {
		
		try {
		int numero = Integer.parseInt(null);
		System.out.println(numero);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
