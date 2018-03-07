/*1. Buatlah program untuk menampilkan bilangan prima hingga batas yg ditentukan. Contoh :
    Batas : 20
    1 2 3 4 5 7 11 13 17 19*/


import java.util.Scanner;  
  
public class Jawaban01Irin {  
  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        int i,j;
        boolean benar;   
        
        System.out.println("Masukkan Batas Nilai Bilangan Prima : ");  
        int batas = input.nextInt();  
        int hasil = 0;  
  
        for(i=1; i<=batas; i++){   
            {  
                benar=false;  
                if (i==2){  
                benar=true;
                }  
                else{  
                    for (j=2;j<i;j++){  
                        if (i%j == 0){  
                        benar=false;  
                        break;  
                        }  
                        else{  
                        benar=true;
                        }  
                    }  
                }  
                if (benar){  
                    System.out.printf(i+" ");  
                }  
            }  
        }  
    }
}