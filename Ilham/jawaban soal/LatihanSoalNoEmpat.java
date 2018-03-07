// ilham 02-03-2018

import java.util.Scanner;

public class LatihanSoalNoEmpat {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i+i-1; k++) {
				if (k == 1 || k == i+i-1) {
					System.out.print("*");
				} 
				else{
					System.out.print(" ");
				}	
			}				
			System.out.println();
		}
		
		for (int i = 4; i >= 1; i--) {
			for (int j = 5-i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i+i-1; k >= 1; k--) {
				if (k == 1 || k == i+i-1) {
					System.out.print("*");
				} 
				else{
					System.out.print(" ");
				}	
			}				
			System.out.println();
		}
	}
}
