package numero2;

public class nulos {

	public static void main(String[] args) {
		
		
		String nome = null;
		try {
		String nome2 = nome.toLowerCase();
		System.out.println(nome2);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
