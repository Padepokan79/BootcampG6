
public class TestKlubInh {

	public static void main(String[] args) {
		JenisKlub j1 = new JenisKlub();
		JenisKlub j2 = new JenisKlub();
		JenisKlub j3 = new JenisKlub();
		Pelatih pel1 = new Pelatih();
		Pelatih pel2 = new Pelatih();
		Pelatih pel3 = new Pelatih();
		Pemain pem1 = new Pemain();
		Pemain pem2 = new Pemain();
		Pemain pem3 = new Pemain();
		// TODO Auto-generated method stub

		j1.klubBola("Real Madrid", "Spanyol");
		j1.jenisKlub("Pria");
		pel1.pelatih("Zizou");
		pem1.pemain("Christiano Ronaldo");
		
		System.out.println("\n ");
		
		j2.klubBola("Barcelona", "Spanyol");
		j2.jenisKlub("Pria");
		pel2.pelatih("Ernesto");
		pem2.pemain("Lionel Messi");
		
		System.out.println("\n");
		
		j3.klubBola("Manchester United", "Inggris");
		j3.jenisKlub("Pria");
		pel3.pelatih("Jose Mourinho");
		pem3.pemain("Paul Pogba");
	}

}
