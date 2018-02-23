// Ilham galang 23 02 2018
public class LatihanSoalArrayNoSatu {
	public static void main(String[] args) {
			
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		double jumlah = 0, rataRata;

		System.out.println("1. Hitung jumlah dan rata-rata dari arr1 ! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
			jumlah += r;
		}
		rataRata = jumlah / arr1.length;
		System.out.println("\nJumlah : " + jumlah);
		System.out.println("Rata-Rata : " + rataRata);
	}
}
