public class JawabanNo14{
	public static void main (String []args){
		String jawaban [] = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
		String roni [] = {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"};
		String dino [] = {"A", "C", "B", "D", "C", "D", "A", "B", "D", "A"};
		int jawabanbenar = 0;


		for (int i = 0 ; i < roni.length; i++){
			if (jawaban [i] == roni [i]){
			jawabanbenar++;
			}
		}
		jawabanbenar = jawabanbenar*100/roni.length;
		System.out.println ("Nilai Roni : " + jawabanbenar);

		jawabanbenar = 0;
		for (int i = 0 ; i < dino.length; i++){
			if (jawaban [i] ==  dino[i]){
			jawabanbenar++;
			}
		}
		jawabanbenar = jawabanbenar*100/dino.length;
		System.out.println ("Nilai Dino : " + jawabanbenar);

	}
}