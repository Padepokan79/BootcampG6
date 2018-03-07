public class jawabanSoal14 {
	public static void main(String[] args) {
		String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
		String[] Roni = {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"};
		String[] Dino = {"A", "D", "B", "D", "C", "D", "A", "B", "D", "A"};

		double jBenarRoni = 0, jBenarDino = 0;

		System.out.print("Jawaban benar : ");
		for (String j : jawaban) {
			System.out.print(j + " ");
		}
		System.out.println();

		System.out.print("Jawaban roni : ");
		for (String r : Roni) {
			System.out.print(r + " ");
		}
		System.out.println();

		System.out.print("Jawaban dino : ");
		for (String d : Dino) {
			System.out.print(d + " ");
		}
		System.out.println();

		for (int i = 0; i < jawaban.length; i++) {
			if (Roni[i].equals(jawaban[i])) {
				jBenarRoni++;
			}
			if (Dino[i].equals(jawaban[i])) {
				jBenarDino++;
			}
		}

		System.out.println("Nilai Roni : " + (int) (jBenarRoni / jawaban.length * 100));
		System.out.println("Nilai Dino : " + (int) (jBenarDino / jawaban.length * 100));
	}
}