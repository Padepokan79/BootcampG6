import java.util.Scanner;

public class ExamNo5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pointer = "0";
		String angka = "0";
		boolean isTrue = false;

		int [] arrNumber = {2,39,47,14,36,56,57,49,43,79};
		int [] temp = new int[0];
		int index=0;


		System.out.println("Deretan number");
		for (int bil : arrNumber) {
			System.out.print(bil+" ");
		}
		System.out.println("\n");

		while(!isTrue){
			System.out.print("Masukkan angka yang mau disisipkan: ");
			angka = input.nextLine();

			if(angka.matches("[\\W]*")){
				System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
			}
			else{
				if(angka.matches("[0-9]*")){
					while(!isTrue){
						System.out.print("Sisipkan pada posisi ke: ");
						pointer = input.nextLine();

						if(pointer.matches("[\\W]*")){
							System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
						}
						else{
							if(pointer.matches("[0-9]*") ){
								if(Integer.parseInt(pointer) < 1){
								System.out.println("Maaf, input posisi tidak boleh kurang dari 1.\nSilahkan input kembali.\n");
								}
								else if(Integer.parseInt(pointer) > 10){
									System.out.println("Maaf, input posisi tidak boleh lebih dari 10.\nSilahkan input kembali.\n");
								}
								else{
									isTrue = true;
								}
							}
							else{
								System.out.println("Maaf, input yang diterima hanya berupa angka positif.\nSilahkan input kembali.\n");
							}
						}
					}
				}
				else{
					System.out.println("Maaf, input yang diterima hanya berupa angka positif.\nSilahkan input kembali.\n");
				}
			}
		}

		temp = new int[arrNumber.length + 1];

		for(int i=0; i< arrNumber.length+1 ; i++){
			if(i == Integer.parseInt(pointer)-1){
				temp[i] = Integer.parseInt(angka);
			}
			else{
				temp[i] = arrNumber[index];
				index++;
			}
		}

		arrNumber = temp;

		for (int bil : arrNumber) {
			System.out.print(bil+" ");
		}
	}
}