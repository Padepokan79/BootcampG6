public class SoalNo13{
	public static void main(String[] args) {
		String [] array = {"A","B","C","D","E","F",
						   "G","H","I","J","K","L",
						   "M","N","O","P","Q","R",
						   "S","T","U","V","W","X","Y","Z"};
		String [] arrTemp = new String [array.length];

		System.out.println("13. Inputan dirubah dengan dengan array yang di geser sebanyak 3 index ke kiri.\n");

		System.out.println("Array before: ");
		for (String huruf : array){
			System.out.print(huruf+" ");
		}

		for(int i=0; i<array.length; i++){
			if(i-3 >=0 ){
				arrTemp[i-3] = array[i];
			}
			else{
				arrTemp[array.length-3 +i] = array[i];
			}
		}

		array = arrTemp;

		System.out.println("\nArray after: ");
		for (String huruf : array){
			System.out.print(huruf+" ");
		}


	}
}