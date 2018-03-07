//SOAL 14
//Buatlah program pengecekkan jawaban siswa Roni dan Dino yang benar dan tampilkan nilainya (banyak jawaban benar/jumlah jawaban*100)!
//String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
//String[] Roni = {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"};
//String[] Dino = {"A", "D", "B", "D", "C", "D", "A", "B", "D", "A"};

public class Jawaban14Irin {
	public static void main(String[] args) {
		String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
		String[] roni = {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"};
		String[] dino = {"A", "D", "B", "D", "C", "D", "A", "B", "D", "A"};
		int index=0, index1=0, benarRoni=0, benarDino=0, nilai;  
		
		System.out.println("Jawaban yang benar adalah: ");
		for ( String i : jawaban) {
			System.out.print(i + " ");
		}

		System.out.println("\nJawaban Roni adalah: ");
		for ( String i : roni  ) {
			if(jawaban[index].equals(i)) {
			benarRoni++;
			}
			index++;
			System.out.print(i + " ");
		}
		System.out.println("\nJawaban Benar Roni sebanyak : " + benarRoni);

		System.out.println("Nilai Roni Adalah : " + (benarRoni*100/jawaban.length));

		System.out.println("\nJawaban Dino adalah: ");
		for ( String j : dino  ) {
			if(jawaban[index1].equals(j)) {
			benarDino++;
			}
			index1++;
			System.out.print(j + " ");
		}
		System.out.println("\nJawaban Benar Dino sebanyak : " + benarDino);

		System.out.println("Nilai Dino Adalah : " + (benarDino*100/jawaban.length));

	}
}