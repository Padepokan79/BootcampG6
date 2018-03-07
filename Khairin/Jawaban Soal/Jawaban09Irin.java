/*Soal No.9

Tampung sejumlah angka kedalam array, (jumlah angka di tentukan oleh user/inputan), 
kemudian tampilkan kembali angka/bilangan yang tadi di input dan jumlahkan seluruh angka pada array tersebut.

contoh :

jumlah angka yang ingin dimasukkan : 3 // input user

angka 1 : 4   // input user
angka 2 : 20  // input user
angka 3 : 23  // input user

4 , 20 , 23
jumlah = 47*/

import java.util.Scanner;
public class Jawaban09Irin {
    public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
       int input = 0;
       int sum = 0;

       System.out.println("Jumlah angka yang ingin dimasukkan : ");
       input = keyboard.nextInt();
       int[] array = new int[input];

       System.out.println("Masukkan Nilai Elemen Dalam Array :");
       for (int i=0; i<array.length; i++)
       {
        System.out.println("Angka " + (i+1) + " : " );
        array[i] = keyboard.nextInt();
       }
       for( int num : array) {
           sum = sum+num;
       }
       System.out.println("Jumlah Dari Semua Elemen Array Adalah :"+sum);
    }
 }