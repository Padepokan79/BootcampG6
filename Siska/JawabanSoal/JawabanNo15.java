public class JawabanNo15{
	public static void main (String[]args){
		int numbers [] = {3, -8, -14, 2, 1, 0, -2, 11, 200, -34, 21};

		for (int i = 0; i < numbers.length-1; i++){
			if (numbers[i] < 0){
				System.out.println ("Nilai negatif " + numbers[i]);
			}
		}
	}
		
}