import java.util.Scanner;

public class HapusArray{
	public static void main(String[] args) {
		//fahreja
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int[] temp = new int[arr1.length - 1];
		int nilai,index = 0;

		for (int i = 0; i < arr1.length; i++ ) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Posisi yang ingin anda hapus (1-10) : ");
		nilai = keyboard.nextInt();

		for (int i = 0; i < arr1.length; i++) {
			if (i != (nilai)) {
					temp[index] = arr1[i];
					index++;
					}			
				}
		arr1 = new int [temp.length];	
			
		for (int i = 0;i < temp.length ; i++ ) {
			arr1[i] = temp[i];
			System.out.print(arr1[i]+ " ");
		}
		}
	}


