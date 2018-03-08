import java.util.Scanner;

public class ExamNo3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String jumlahAnggota = "0";
		String jumlahBulan = "0";
		boolean isTrue = false;
		int jumlahHari, tabunganPerBulan =0, totalTabungan=0;

		System.out.println("Tabungan Keluarga.\n");
		while(!isTrue){
			System.out.print("Masukkan jumlah keluarga: ");
			jumlahAnggota = input.nextLine();

			if(jumlahAnggota.matches("[\\W]*")){
				System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
			}
			else{
				if(jumlahAnggota.matches("[0-9]*")){
					if(Integer.parseInt(jumlahAnggota) < 2){
						System.out.println("Maaf, jumlah keluarga tidak boleh kurang dari 2.\nSilahkan input kembali.\n");
					}
					else if(Integer.parseInt(jumlahAnggota) > 6){
						System.out.println("Maaf, jumlah keluarga tidak boleh lebih dari 6.\nSilahkan input kembali.\n");
					}
					else{
						
						while(!isTrue){
							System.out.print("Masukkan lama tabungan: ");
							jumlahBulan = input.nextLine();

							if(jumlahBulan.matches("[\\W]*")){
								System.out.println("Maaf, inputan anda masih kosong dan input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
							}
							else{
								if(jumlahBulan.matches("[0-9]*") ){
									if(Integer.parseInt(jumlahBulan) < 1){
									System.out.println("Maaf, lama tabungan tidak boleh kurang dari 1.\nSilahkan input kembali.\n");
									}
									else if(Integer.parseInt(jumlahBulan) > 12){
										System.out.println("Maaf, lama tabungan tidak boleh lebih dari 12.\nSilahkan input kembali.\n");
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
				}
				else{
					System.out.println("Maaf, input yang diterima hanya berupa angka positif.\nSilahkan input kembali.\n");
				}
			}
		}


		for(int i=1 ; i<=Integer.parseInt(jumlahBulan) ; i++){
			if(i == 2){
				jumlahHari = 28;
			}
			else if(i==4 || i==6 || i==9 || i==11){
				jumlahHari = 30;
			}
			else{
				jumlahHari = 31;
			}

			tabunganPerBulan=0;
			for(int j=jumlahHari; j>=1 ; j--){
				tabunganPerBulan = tabunganPerBulan + (j*1000);
			}

			totalTabungan = totalTabungan + (tabunganPerBulan*Integer.parseInt(jumlahAnggota));
			System.out.println("Tabungan pada bulan ke-"+i+" sebesar "+ (tabunganPerBulan*Integer.parseInt(jumlahAnggota)));
		}
		System.out.println("\nTotal tabungan selama "+Integer.parseInt(jumlahBulan)+" bulan dengan "+Integer.parseInt(jumlahAnggota)+" anggota keluarga adalah "+ totalTabungan);

	}
}