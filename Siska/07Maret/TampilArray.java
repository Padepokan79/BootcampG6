public class TampilArray{
	public static void main (String []args){
		int [] array1 = { 3, 2, 6, 7, 4};
		int [] array2 = { 2, 0, 8, 2, 4};

		for (int num : array1){
			System.out.print ( num + " ");
		}

		for (int num : array2){
			System.out.print ("\n" + num + " ");
		}
	}
}