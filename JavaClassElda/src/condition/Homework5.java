package condition;

public class Homework5 {

	public static void main(String[] args) {
		boolean allergy =true;
		boolean peanut =true;
		boolean lactose=true;
		boolean seafood=false;
		   if (allergy) {
			System.out.println("You have allergy ");
			
			if (peanut) { 
				System.out.println("Do not eat peanut" );
			}
			if (lactose) {
				System.out.println("Do not drink milk");
			}
			
			if (seafood ) {
					System.out.println("Do not eat fish");
					
				}
				
		   }else {
			  System.out.println(" You are herlthy");
		}
	}

}
