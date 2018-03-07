public class SoalNo14{
	public static void main(String[] args) {
		String [] jawaban = {"A","C","B","D","C","D","B","B","A","A"};
		String [] roni ={"B","D","B","D","C","D","B","B","D","A"};
		String [] dino ={"A","D","B","D","C","D","A","B","D","A"};
		int index=0,index1=0,jawabanBenarRoni=0, jawabanBenarDino=0;
		double nilaiRoni, nilaiDino;

		System.out.println("14. Buatlah program pengecekkan jawaban siswa Roni dan Dino yang benar,\n    Tampilkan nilainya!\n");
		System.out.println("Kunci Jawaban: ");
		for(String i : jawaban){
			System.out.print(i+", ");
		}

		System.out.println("\n\nJawaban Roni: ");
		for(String i : roni){
			System.out.print(i+", ");

			if(jawaban[index].equals(i)){
				jawabanBenarRoni++;
			}
			index++;
		}

		System.out.println("\nJumlah jawaban benar: "+jawabanBenarRoni);

		nilaiRoni=jawabanBenarRoni*100/jawaban.length;
		System.out.println("Nilai Roni : "+(int)nilaiRoni);

		System.out.println("\nJawaban Dino: ");
		for(String i : dino){
			System.out.print(i+", ");

			if(jawaban[index1].equals(i)){
				jawabanBenarDino++;
			}
			index1++;
		}

		System.out.println("\nJumlah jawaban benar: "+jawabanBenarDino);

		nilaiDino=jawabanBenarDino*100/jawaban.length;
		System.out.println("Nilai Dino : "+(int)nilaiDino);
	}
}