//Siska Pitriani 23 Februari 2018
public class LatihanArray1{
	public static void main (String[]args){
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		double jumlah = 0, rata;

		
		for (int a : arr1) {
			System.out.println (a + " ");
			jumlah = jumlah + a;
		}
			rata = jumlah/10;
			System.out.println ("Jumlah dari array 1 : " + jumlah );
			System.out.println ("Rata-rata dari array 1 : " + rata);
	}
}