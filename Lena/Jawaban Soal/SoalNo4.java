public class SoalNo4{
	public static void main(String[] args) {

		System.out.println("4. Buatlah bentuk Diamond yang tengahnya kosong!\n");
		for(int i=1; i<=5;i++){

			for(int j=5;j>i;j--){
				System.out.print(" ");
			}

			for (int k=1;k<=i;k++ ) {
				if(k==1 ||k==i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for(int i=4; i>0;i--){
			System.out.print(" ");
		
			for(int j=4;j>i;j--){
				System.out.print(" ");
			}
		
			for (int k=1;k<=i;k++ ) {
				if(k==1 ||k==i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}