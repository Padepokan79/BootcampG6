public class Soal1 {
	public static void main( String[] args ) {
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		double jumlah = 0, rata = 0;

		// jumlah
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			 System.out.print( arr1[i] + " " );
			 jumlah = jumlah + arr1[i];
			 rata = jumlah / arr1.length;
		}
		System.out.println( "\nJumlah array: " + jumlah );

		// rata rata
		System.out.println( "Rata-rata array: " + rata );
	}
}