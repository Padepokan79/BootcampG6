import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] temp = new int[10];
		String shift;
		int shiftInt, index=0;
		boolean kondisi = true;


	System.out.println("Bilangan pada sebuah array adalah : ");
	for (int arr : array){
		System.out.print(arr + " ");
	}

	System.out.println("Shift ke kiri sebanyak : ");
	shift = keyboard.nextLine();

	while (shift.matches("[A-Zaz]") || Integer.valueOf(shift) < 1 || Integer.valueOf(shift) > 10){
		if (shift.matches("[A-Zaz]")){
			System.out.println("Maaf, input yang diterima hanya berupa angka.");
			System.out.println("Silahkan input kembali."); shift = keyboard.nextLine();	
		}
		else if (Integer.valueOf(shift) < 1){
			System.out.println("Maaf, jumlah shift tidak boleh kurang dari 1.");
			System.out.println("Silahkan input kembali."); shift = keyboard.nextLine();	
		}
		else if (Integer.valueOf(shift) > 10){
			System.out.println("Maaf, jumlah shift tidak boleh lebih dari 10.");
			System.out.println("Silahkan input kembali."); shift = keyboard.nextLine();	
		}
	}

	shiftInt = Integer.valueOf(shift);

		for (int j = 0; j<array.length; j++){
			if(shiftInt < array.length){
				temp[j] = array[shiftInt];
			}
			else{
				temp[j] = array[shiftInt-array.length];
			}
			shiftInt +=1;
	}

	for (int k = 0; k<array.length; k++){
			array[k] = temp[k];
		}

		for (int arr : array){
			System.out.print(arr + " ");
		}
	}
}

