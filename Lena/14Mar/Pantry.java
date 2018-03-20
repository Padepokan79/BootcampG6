package exercise35;

public class Pantry {
	private Jam jar1, jar2, jar3, selected;

	public Pantry() {
		// TODO Auto-generated constructor stub
	}
	
	public Pantry(Jam jar1, Jam jar2) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		jar3 = null;
		selected = null;
	}
	
	public Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}
	
	public void print() {
		System.out.println("\nThe jams are: ");
		if(jar1 != null) {
			System.out.print("1: "); jar1.print();
		}
		if(jar2 != null) {
			System.out.print("2: "); jar2.print();
		}
		if(jar3 != null) {
			System.out.print("3: "); jar3.print();
		}		
	}
	
	public void select(int jarNumber) {
		if(jarNumber == 1) {
			selected = jar1;
		}
		else if(jarNumber == 2) {
			selected = jar2;
		}
		else {
			selected = jar3;
		}
	}
	
	public boolean select2(int jarNumber) {
		boolean isTrue = false;
		if(jarNumber == 1 && jar1 != null) {
			selected = jar1;
			isTrue = true;
		}
		else if(jarNumber == 2 && jar2 != null){
			selected = jar2;
			isTrue = true;
		}
		else if(jarNumber == 3 && jar3 != null) {
			selected = jar3;
			isTrue = true;
		}
		
		return isTrue;
	}
	
	public void spread(int amount) {
		selected.spread(amount);
	}
	
	public void replace(Jam jam, int slot) {
		if(slot == 1) {
			jar1 = jam;
		}
		else if(slot == 2) {
			jar2 = jam;
		}
		else if(slot == 3) {
			jar3 = jam;
		}
	}
	
	public void mixedFruit() {
		if(jar1.getCapacity() <= 2 && jar2.getCapacity() <= 2 && jar3.getCapacity() <=2) {
			jar1.setContents("Mixed Fruit");
			jar1.setCapacity(jar1.getCapacity() + jar2.getCapacity() + jar3.getCapacity());
			jar2 = null;
			jar3 = null;
		}
	}
}
