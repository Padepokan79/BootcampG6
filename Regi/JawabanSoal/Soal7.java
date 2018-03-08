import java.util.Scanner;

public class Soal7 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String nama;
		int undangan, hadiah, umur, jenisKelamin;
		double penampilan;

		System.out.print("\n1. Masukkan nama anda: ");
		nama = keyboard.next();
		System.out.print("\n2. Apakah anda memiliki undangan? (1.ya / 2.tidak): ");
		undangan = keyboard.nextInt();
		System.out.print("\n3. Apakah anda membawa sebuah hadiah? (1.ya / 2.tidak): ");
		hadiah = keyboard.nextInt();
		System.out.print("\n4. Berapa umur anda: ");
		umur = keyboard.nextInt();
		System.out.print("\n5. Jenis kelamin? (1.pria / 2.wanita): ");
		jenisKelamin = keyboard.nextInt();
		System.out.print("\n6. Penampilan? (0.0 - 10.0): ");
		penampilan = keyboard.nextDouble();

		if (undangan == 1) {
			System.out.println("\nboleh masuk");
		} else if (undangan == 2 && hadiah == 1 && umur <= 20) {
			System.out.println("\nboleh masuk");
		} else if (undangan == 2 && hadiah == 2 && jenisKelamin == 2 && umur <= 20 && penampilan >= 8) {
			System.out.println("\nboleh masuk");
		} else {
		 	System.out.println("tidak bisa masuk");
		}
	}
}