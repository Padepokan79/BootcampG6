public class BilanganHabisBagiLena{
	public static void main(String[] args) {

		System.out.println("Bilangan yang habis dibagi 3 dan 5: ");
		for(int i=30;i<=90;i++){
			if(i%3==0 && i%5==0){
				System.out.println(i);
			}
		}
	}
}