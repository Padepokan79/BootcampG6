//Siska Pitriani 26 Februari 2018
public class LatihanArray12{
	public static void main (String[]args){
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];

		for (int i = 0; i < arr1.length ; i ++){
			arr4[i] = arr1[i] + arr3[i];
		}
		
		System.out.println ("Jumlah elemen arr1 dan arr3 : " );

		for (int num : arr4) {
			System.out.print (num + " ");
		}
	
	}
}