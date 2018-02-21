public class DagangKue{
	public static void main (String []args){
		int awalKue;
		double waktu ;

		awalKue = 200;
		for (waktu = 15; waktu<= 450; waktu = waktu + 15 ){
			awalKue = awalKue - 3;
		}
		System.out.println ("Sisa kue : "+ awalKue);
	}
}