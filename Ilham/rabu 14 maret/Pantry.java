
public class Pantry {
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;
	
	public Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}
	
	public Pantry(Jam jar1, Jam jar2) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = null;
		selected = null;
	}
	
	public void print() {
		if (jar1 != null) {
			System.out.print("1: "); jar1.print();
		}
		if (jar2 != null) {
			System.out.print("2: "); jar2.print();
		}
		if (jar3 != null) {
			System.out.print("3: "); jar3.print();		
		}
	}
	
	public boolean select(int jarNumber) {
		if (jarNumber == 1) {
			if (jar1 != null) {
				selected = jar1;
				return true;
			}
			else {
				return false;
			}
		}
		else if (jarNumber == 2) {
			if (jar2 != null) {
				selected = jar2;
				return true;
			}
			else {
				return false;
			}
		}
		else if (jarNumber == 3){
			if (jar3 != null) {
				selected = jar3;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void spread(int oz) {
		selected.spread(oz);
	}
	
	public void replace(Jam jar, int slot) {
		if (slot == 1) {
			this.jar1 = jar;
		} 
		else if (slot == 2) {
			this.jar2 = jar;
		}
		else if (slot == 3) {
			this.jar3 = jar;
		}	
	}
	
	public void mixedFruit() {
		if (jar1.capacity <= 2 && jar2.capacity <= 2&& jar3.capacity <= 2) {
			jar1.capacity = jar1.capacity + jar2.capacity + jar3.capacity; 		
			jar1.contents = "Mixed Fruit";
	
			this.jar2 = null;
			this.jar3 = null;	
		}
	}
}
