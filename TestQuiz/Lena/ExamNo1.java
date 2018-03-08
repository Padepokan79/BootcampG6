import java.util.Scanner;

public class ExamNo1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String batas = "0";
		boolean isTrue = false;

		int [] fibonacci = new int[0];


		while(!isTrue){
			System.out.print("Jumlah urutan angka Fibonacci yang akan ditampilkan: ");
			batas = input.nextLine();

			if(batas.matches("[\\W]*")){
				System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
			}
			else{
				if(batas.matches("[0-9]*") ){
					if(Integer.parseInt(batas) < 5){
						System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.\nSilahkan input kembali.\n");
					}
					else if(Integer.parseInt(batas) > 100){
						System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.\nSilahkan input kembali.\n");
					}
					else{
						fibonacci = new int[Integer.parseInt(batas)];
						fibonacci[0] = 1;
						fibonacci[1] = 1;

						for(int i=2; i< fibonacci.length; i++){
							fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
						}
						for (int bil : fibonacci) {
							System.out.print(bil+" ");
						}
						isTrue = true;
					}
				}
				else{
					System.out.println("Maaf, input yang diterima hanya berupa angka positif.\nSilahkan input kembali.\n");
				}
			}
		}
	}
}