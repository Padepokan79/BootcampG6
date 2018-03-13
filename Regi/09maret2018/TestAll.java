
public class TestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrushPen brushPen = new BrushPen();
		brushPen.inputData(50000, 12, "All", "Besar", "Faber Castell", "Kaligrafi");
		brushPen.tampilData();
		
		System.out.println();
		
		Gitar gitar = new Gitar();
		gitar.inputData("Listrik", "Gibson", "Kayu Mahogani", "Steel", "Hitam", 12000000, 6);
		gitar.tampilData();
		
		System.out.println();
		
		Solenoid solenoid = new Solenoid();
		solenoid.inputData(50, 5, "Stainless Steel", "ACDC", "Mesin Dispenser");
		solenoid.tampilData();
		
		System.out.println();
		
		GuntingRambut guntingRambut = new GuntingRambut();
		guntingRambut.inputData("Zig-Zag", "Sedang", "Steel", 35000);
		guntingRambut.tampilData();
		
	}

}
