
public class BaksoAtom extends Atom {
	int levelPedas = 3, harga = 15000;
	String jenisBakso = "Mie Bakso Campur";
	
	void tambahBaksoAtom(String jenisBakso, int harga, int levelPedas) {
		tambahAtom(massa);
		this.harga = harga;
		this.jenisBakso = jenisBakso;
		this.levelPedas = levelPedas;
	}
	
	void tampilBaksoAtom() {
		System.out.println("Bakso Atom");
		System.out.println(jenisBakso);
		System.out.println("Pedas level " + levelPedas);
		System.out.println("Harga : " + harga);
		tampilAtom();
	}
}
