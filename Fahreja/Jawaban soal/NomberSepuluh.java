public class NomberSepuluh{
	public static void main(String[] args) {
		//Fahreja

		int[] arr1 = {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26};
		int temp = 0;

		for (int i = 0; i < arr1.length ; i++ ) {
			for (int j = arr1.length-1; j > i ; j--) {
				if (arr1[j] < arr1[j-1]) {
					temp = arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = temp;
				}
			}
		}

		for (int i = 0; i < arr1.length ; i++ ) {
			for (int j = arr1.length-1; j > i ; j--) {
				if (arr1[j-1] == 0) {
					temp = arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = temp;
				}
			}
		}


		for (int angka : arr1) {
			System.out.print(angka+" ");	
		}
	}
}