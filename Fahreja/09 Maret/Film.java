
public class Film {
	String genre, rating, judul, studio;
	int harga;
	
	Film(){
		
	}
	Film(String gn,String rate,String jd,String st,int hrg){
		genre = gn;
		rating =rate;
		judul=jd;
		studio = st;
		harga= hrg;
	}
	void tampil() {
		System.out.println("Judul  Film : "+judul);
		System.out.println("Rating Film : "+rating);
		System.out.println("Genre  Film : "+genre);
		System.out.println("Studio Film : "+studio);
		System.out.println("Harga  Film : "+harga);
		System.out.println("");
	}
}
