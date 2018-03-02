public class NilaiDuplikasi{
	public static void main(String[] args) {
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int dupli = arr1[0];

		System.out.println("Nilai Array: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}

		System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++){
				if (arr1[i] == arr1[j]) {
					dupli = arr1[i]; 
				}
			}
		}

		System.out.print("Angka duplikasi : "+ dupli);
	}
}