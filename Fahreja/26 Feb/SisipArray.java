import java.util.Scanner;

public class SisipArray{
	public static void main(String[] args) {
		//fahreja
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int[] temp = new int[arr1.length + 1];
		int nilai,urutan,index = 0;

		for (int i = 0; i < arr1.length; i++ ) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Nilai yang ingin anda sisipkan : ");
		nilai = keyboard.nextInt();
		System.out.print("Masukan posisi (1-11) : ");
		urutan= keyboard.nextInt();

		for (int i = 0; i < temp.length; i++) {
			if (i != (urutan-1)) {
					temp[i] = arr1[index];
					index++;
			}else{
				temp[i] = nilai;
				}		
			}
			arr1 = new int [temp.length];	
			
		for (int i = 0;i < arr1.length ; i++ ) {
			arr1[i] = temp[i];
			System.out.print(arr1[i]+ " ");
		}
	}
}