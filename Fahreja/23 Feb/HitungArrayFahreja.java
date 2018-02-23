public class HitungArrayFahreja{
	public static void main(String[] args) {
		double[] arr1={ 25,14,56,15,36,56,77,18,29,49 };
		double rata,jumlah;

		jumlah = 0;

		for (double angka : arr1) {
			jumlah += angka;
			System.out.println("jumlah isi saat ini : " + jumlah);
		}
		rata = jumlah / arr1.length;
		System.out.println("Jumlah isi array : " + jumlah);
		System.out.println("Rata - rata array : "+ rata);
	}
	
}