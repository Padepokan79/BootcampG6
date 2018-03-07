/*6. Buatlah array bilFibonacci yang berisikan barisan bilangan fibonacci dari 1 - 1000.
   Dari array tersebut:
    - copy bilangan prima ke sebuah array baru, bilPrima.
    - copy bilangan yang habis bagi ke array baru lainnya, bilHabisBagi.
   Kemudian tampilkan ketiga array tersebut.*/
import java.util.Scanner;
public class Jawaban06Irin {
    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci ");
        int n = show.nextInt();
        long fib[] = new long[100];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
 
}