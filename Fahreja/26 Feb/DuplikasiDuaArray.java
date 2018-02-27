public class DuplikasiDuaArray{
	public static void main(String[] args) {
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int[] arr3 = { 2,39,47,14,36,56,57,49,43,79 };
		int dupli = 0;	
		System.out.println("Nilai Array 1: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}

		System.out.println();
		System.out.println("Nilai Array 3: ");
		for (int angka : arr3) {
			System.out.print(angka + " ");
		}
		System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr3.length; j++){
				if (arr1[i] == arr3[j]) {
					dupli = arr3[j]; 
					System.out.println("Angka duplikasi : "+ dupli);
				}
			}
		}
		
	}
}