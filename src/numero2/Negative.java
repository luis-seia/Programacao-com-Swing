package numero2;

public class Negative {
	public static void main(String args[]) {
		try {
		int num[] = new int[-2];
		}catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}
 	}
}
