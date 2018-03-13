
public class TestLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptopIlham = new Laptop();
		Laptop laptopFahreja= new Laptop();
		
		laptopIlham.merk = "ASUS";
		laptopIlham.tipe = "X452C";
		laptopIlham.harga = 123123;
		laptopFahreja.tambahLaptop("lenovo", "AMD10", 123456);
		
		laptopIlham.tampilLaptop();
		laptopFahreja.tampilLaptop();
	}

}
