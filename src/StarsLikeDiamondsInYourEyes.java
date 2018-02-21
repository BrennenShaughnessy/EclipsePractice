
public class StarsLikeDiamondsInYourEyes {

	public static void main(String[] args) {

		
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < 10; j ++) {
				
				for (int k = 0; k < 10 - j; k ++) {
					System.out.print(" ");
				}
				for (int k = 0; k < j; k ++) {
					System.out.print("*");
				}
				for (int k = 0; k < j - 1; k ++) {
					System.out.print("*");
				}
				
				System.out.println();
								
			}

			// Goodbye Moonmen! 
			
			for (int j = 0; j < 10; j ++) {
				
				for (int k = 0; k < j; k ++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 10 - j; k ++) {
					System.out.print("*");
				}
				for (int k = 0; k < 10 - j - 1; k ++) {
					System.out.print("*");
				}
				
				System.out.println();
								
			}

		
		}
		
	}

}
