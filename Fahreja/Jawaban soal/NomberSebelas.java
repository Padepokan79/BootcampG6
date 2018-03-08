import java.util.Scanner;

public class NomberSebelas{
	public static void main(String[] args) {
		//Fahreja
		Scanner nilai = new Scanner(System.in);
		int[] arr1 = {0,1,2,3,4,5,6,7,8,9,10,};
		int batas,temp;

		System.out.print("Masukan nilai : ");
		batas = nilai.nextInt();

		for (int i = 0; i <= batas/2 ; i++ ) {
			for (int j = 0; j <= batas ; j++ ) {
				temp = arr1[i]+arr1[j];
				if (temp == batas) {
					System.out.print(i+" dan "+j +" ");
				}
			}
		}
	}
}