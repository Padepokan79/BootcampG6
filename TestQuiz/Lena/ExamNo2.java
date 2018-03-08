import java.util.Scanner;

public class ExamNo2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String batas = "0";
		boolean isTrue = false;

		int [][] paskal = new int[0][0];


		while(!isTrue){
			System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan: ");
			batas = input.nextLine();

			if(batas.matches("[\\W]*")){
				System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
			}
			else{
				if(batas.matches("[0-9]*") ){
					if(Integer.parseInt(batas) < 2){
						System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.\nSilahkan input kembali.\n");
					}
					else if(Integer.parseInt(batas) > 20){
						System.out.println("Maaf, jumlah baris angka tidak boleh lebih dari 20.\nSilahkan input kembali.\n");
					}
					else{
						paskal = new int[Integer.parseInt(batas)][Integer.parseInt(batas)];
						
						for(int x=0; x< Integer.parseInt(batas); x++){
							for(int y=0; y<=x ; y++){
								if(y==0 || y==x){
									paskal[x][y] = 1;
								}else{
									paskal[x][y] = paskal[x-1][y-1] + paskal[x-1][y];
								}
								System.out.print(paskal[x][y]+" ");
							}
							System.out.println();
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