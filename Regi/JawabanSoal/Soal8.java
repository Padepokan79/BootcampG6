import java.util.Scanner;

public class Soal8 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        int angka;

        System.out.print("\nInput Angka: ");
        angka = keyboard.nextInt();

        for (int i = 1; i <= angka; i++) {
        	System.out.println();
        	for (int j = angka; j >= i; j--) {
        		System.out.print(" ");
        	}
        	for (int k = 1; k <= i; k++) {
        		System.out.print("#");	
        	}
        }
        System.out.println();
    }
}