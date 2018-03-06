import java.util.Scanner;

public class jawabanSoal7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nama;
		int undangan, hadiah, umur, jKelamin;
		double penampilan;

		System.out.print("Masukkan nama anda : "); nama = input.nextLine();
		System.out.print("Apakah anda memiliki undangan ? (1. Ya / 2. Tidak) "); undangan = input.nextInt();
		System.out.print("Apakah anda membawa sebuah hadiah ? (1. Ya / 2. Tidak) "); hadiah = input.nextInt();
		System.out.print("Berapa umur anda ? "); umur = input.nextInt();
		System.out.print("Jenis kelamin ? (1. Pria / 2. Wanita) "); jKelamin = input.nextInt();
		System.out.print("Berapa rasio penampilan anda ? "); penampilan = input.nextDouble();

		if (undangan == 1) {
			System.out.println("Anda boleh masuk.");
		} else if (undangan == 2 && hadiah == 1 && umur <= 20) {
			System.out.println("Anda boleh masuk.");
		} else if (undangan == 2 && hadiah == 2 && jKelamin == 2 && umur <= 20 && penampilan >= 8) {
			System.out.println("Anda boleh masuk.");
		} else {
		 	System.out.println("Anda tidak boleh masuk.");
		}
	}
}