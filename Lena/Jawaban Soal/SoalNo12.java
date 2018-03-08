public class SoalNo12{
	public static void main(String[] args) {

		System.out.println("12. Grade Histogram.\n");

		for(int i = 0 ; i < 6 ; i++){

			if(i == 0){
				System.out.print(" 0 -  9 : ");
			}else{
				System.out.print(i+"0 - "+i+"9 : ");
			}
			
			for(int j = 0 ; j <= i ; j++){
				System.out.print("*");
			}

			System.out.println("");
		}

		System.out.println("\n\n");

		for(int i = 0 ; i < 6 ; i++){

			for(int j = 0 ; j < 6 ; j++){
				if(i+j >= 5){
					System.out.print("   *  ");
				}
				else{
					System.out.print("      ");
				}
			}

			System.out.println("");
		}

		for(int i = 0 ; i < 6 ; i++){

			if(i == 0){
				System.out.print(" 0- 9 ");
			}else{
				System.out.print(i+"0-"+i+"9 ");
			}
		}

	}
}