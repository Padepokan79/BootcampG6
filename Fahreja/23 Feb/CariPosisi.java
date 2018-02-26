import java.util.Scanner;
public class CariPosisi{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1={ 25,14,56,15,36,56,77,18,29,49 };
		int cari, index;
		
		for (int angka : arr1) {
			System.out.print(angka+" ");
		}
		System.out.print("\nMasukan nilai yang ingin dicari : ");
		cari =keyboard.nextInt();

		for (index = 0; index < arr1.length; index++) {
				if (cari == arr1[index]){
					System.out.println(cari +" ada di index ke : " + index);
				}
			}
	
	}
}