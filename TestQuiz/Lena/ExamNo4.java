import java.util.Scanner;

public class ExamNo4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String shift = "0";
		boolean isTrue = false;

		int [] arrNumber = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] temp = new int[arrNumber.length];


		System.out.print("{");
		for (int bil : arrNumber) {
			System.out.print(bil+" ");
		}
		System.out.print("}\n\n");

		while(!isTrue){
			System.out.print("Shift ke kiri sebanyak: ");
			shift = input.nextLine();

			if(shift.matches("[\\W]*")){
				System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
			}
			else{
				if(shift.matches("[0-9]*")){
					if(Integer.parseInt(shift) < 1){
						System.out.println("Maaf, pergeseran tidak boleh kurang dari 1.\nSilahkan input kembali.\n");
					}
					else if(Integer.parseInt(shift) > 10){
						System.out.println("Maaf, pergeseran angka tidak boleh lebih dari 10.\nSilahkan input kembali.\n");
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

		for(int i=0; i< arrNumber.length; i++){
			if(i-Integer.parseInt(shift) < 0){
				temp[arrNumber.length+i-Integer.parseInt(shift)] = arrNumber[i];
			}
			else{
				temp[i-Integer.parseInt(shift)] = arrNumber[i];
			}
		}

		arrNumber = temp;

		System.out.print("{");
		for (int bil : arrNumber) {
			System.out.print(bil+" ");
		}
		System.out.print("}");
	}
}