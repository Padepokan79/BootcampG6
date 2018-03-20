package progExercises35;
public class Pantry {
	
	// Instance Variables
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;
	
	// Constructors
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}
	
	Pantry(Jam jar1, Jam jar2) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = null;
		selected = null;
	}
	
	Pantry(Jam jar1) {
		this.jar1 = jar1;
		this.jar2 = null;
		this.jar3 = null;
		selected = null;
	}
	
	// Methods
	public void print() {
		if(jar1 != null) {
			System.out.print("1: ");
			jar1.print();
		}
		if(jar2 != null) {
			System.out.print("2: ");
			jar2.print();	
		}
		if(jar3 != null) {
			System.out.print("3: ");
			jar3.print();
		}
	}
	
	boolean select(int jarNumber) {
		if(jarNumber == 1) {
			selected = jar1;
		}
		else if(jarNumber == 2) {
			selected = jar2;
		}
		else {
			selected = jar3;
		}
		if(selected != null) {
			return true;
		}
		return false;
	}
		
	public void spread(int oz) {
		selected.spread(oz);
	}
	
	public void replace(Jam j, int slot) {
		if (slot == 1) {
			this.jar1 = j;
		}
		if (slot == 2) {
			jar2 = j;
		}
		if (slot == 3) {
			jar3 = j;
		}
	}
	
	public void mixedFruit()
	{
		if(jar1.capacity <= 2 && jar2.capacity <= 2 && jar3.capacity <= 2)
		{
			this.replace(new Jam("Mixed Fruit", jar1.date, jar1.capacity + jar2.capacity + jar3.capacity),1);
			jar2 = null;
			jar3 = null;
		}
	}

}
