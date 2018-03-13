
public class IbuKotaProvinsi {
	String namaProvinsi, ibuKota;
	
	public IbuKotaProvinsi() {
		// TODO Auto-generated constructor stub
	}
	
	void ibuKota(String prov, String ibuK) {
		namaProvinsi = prov;
		ibuKota = ibuK;
		System.out.println("Ibu kota provinsi " + namaProvinsi + " adalah Kota " + ibuKota);
	}

}
