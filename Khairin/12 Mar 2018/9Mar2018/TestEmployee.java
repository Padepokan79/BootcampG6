package eclipse;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.insert(203,"Asep",46000);
		emp2.insert(205, "Jaja", 23000);
		emp3.insert(206, "Nakul", 56000);
		emp1.display();
		emp2.display();
		emp3.display();
	}

}
