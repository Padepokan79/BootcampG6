import java.util.Scanner;

public class ThirtyDays{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int moth, days;
	String mothName;
	
	System.out.print("Which moth? (1-12)");
	moth = keyboard.nextInt();

		switch (month) {
				case 1 : mothName = "January";
					break;
				case 2 : mothName = "February";
					break;
				case 3 : mothName = "March";
					break;
				case 4 : mothName = "April";
					break;
				case 5 : mothName = "May";
					break;
				case 6 : mothName = "June";
					break;
				case 7 : mothName = "July";
					break;
				case 8 : mothName = "August";
					break;
				case 9 : mothName = "September";
					break;
				case 10 : mothName = "October";
					break;
				case 11 : mothName = "November";
					break;
				case 12 : mothName = "Desember";
					break;								
			}	
	}
}