import java.util.HashMap;

public class BudiDanBedu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menit=0, tempat = 0,budi =0, bedu=0, jam=0, sisaMenit;
		HashMap<Integer, Integer> jarak = new HashMap<Integer, Integer>();
		jarak.put(1, 350);
		jarak.put(2, 30);
		jarak.put(3, 40);
		
		for (int waktu = 30; waktu < jarak.get(1); waktu +=30) {
			if ((budi + bedu) < jarak.get(1)) {
				bedu = bedu + jarak.get(2);
				budi = budi + jarak.get(3);
				menit = menit + 30;
				
			}
		}
		sisaMenit = menit % 60;
		jam = (menit - sisaMenit)/60;
		jam = jam + 6;
		System.out.println("Bedu bertemu budi pada km "+bedu);
		System.out.println("Budi bertemu bedu pada km "+budi);
		System.out.println("Mereka bertemu pada jam "+jam +"."+sisaMenit);
	
	}

}
