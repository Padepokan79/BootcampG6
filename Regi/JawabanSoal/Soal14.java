public class Soal14 {
	public static void main(String[] args) {
		String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
		String[] roni = {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"};
		String[] dino = {"A", "D", "B", "D", "C", "D", "A", "B", "D", "A"};

		double jawabanRoni = 0, jawabanDino = 0;

		System.out.print("Jawaban Benar : ");
		for (String j : jawaban) {
			System.out.print(j + " ");
		}

		System.out.println();
		System.out.print("Jawaban Roni : ");
		for (String r : roni) {
			System.out.print(r + " ");
		}

		System.out.println();
		System.out.print("Jawaban Dino : ");
		for (String d : dino) {
			System.out.print(d + " ");
		}

		System.out.println();
		for (int i = 0; i < jawaban.length; i++) {
			if ( roni[i].equals(jawaban[i]) ) {
				jawabanRoni++;
			}
			if ( dino[i].equals(jawaban[i]) ) {
				jawabanDino++;
			}
		}

		System.out.println("Nilai Roni : " + (int) ( jawabanRoni / jawaban.length * 100) );
		System.out.println("Nilai Dino : " + (int) ( jawabanDino / jawaban.length * 100) );
	}
}