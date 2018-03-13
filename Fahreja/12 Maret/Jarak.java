import java.util.Scanner;

public class Jarak {
	public static void main(String[] args) {
		Scanner nilai  = new Scanner(System.in);
		int singgah;
		int start;
		double gallons;
		boolean key = false;
		String des;
		
		System.out.println("Masukan nilai awal : ");
		start = nilai.nextInt();
		Mobil mebo = new Mobil (start);
		
		
		do {
		
		System.out.print("Masukan Spedo meter:");
		singgah = nilai.nextInt();
		System.out.print("Masukan bahan bakar :");
		gallons = nilai.nextDouble();
		
		mebo.fillUp(singgah, gallons);
		System.out.println("Mill per galon adalah : "+mebo.calculatedMPG());
		
		if (mebo.gasHog()) {
			System.out.println("Mobil anda boros");
		}else if(mebo.ekonomis()) {
			System.out.println("Mobil anda ekonomis");
		}else {
			System.out.println("Biasa saja");
		}
		
		mebo.timpa();
		System.out.println("Apakah anda sudah berhenti (Ya/Tidak) :");
		des = nilai.next();
		
		if(des.equalsIgnoreCase("y")||des.equalsIgnoreCase("Ya")) {
			key = true;
		}else {}
		
		
		}while (key != true);
	}

}
