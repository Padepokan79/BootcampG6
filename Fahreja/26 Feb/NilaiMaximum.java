public class NilaiMaximum{
	public static void main(String[] args) {
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int max = arr1[0];
		System.out.println("Nilai Array: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}

		System.out.println();

		for (int i = 0; i < arr1.length-1; i++) {
			if (arr1[i] > arr1[i+1]){
				if(arr1[i] > max){
					max = arr1[i];
				}
			}
		}
		System.out.print("Angka maximum : "+ max);
	}
}