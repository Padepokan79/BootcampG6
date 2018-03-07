/*Soal No.8 
buat sebuah tampilkan # membentuk sebuah tangga, seperti contoh berikut: 

contoh 1:
input angka : 5  // di input user

    #
   ##
  ###
 ####
#####

contoh 2:
input angka : 3  // di input user

  #
 ##
###
*/

import java.util.Scanner;
public class Jawaban08Irin {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int tangga = 0;
		
		System.out.println("# TANGGA");
		System.out.println("Masukkan jumlah anak tangga: "); 
		tangga = keyboard.nextInt();
		
		for (int a=1; a<=tangga; a++) {
		for(int c=1; c<=tangga-a; c++) {
		System.out.print(" ");
		}
		for (int b=1; b<=a-1; b++) {
		System.out.print("#");
		}
		System.out.println("#");
		}
		System.out.println("\n");

	}
}