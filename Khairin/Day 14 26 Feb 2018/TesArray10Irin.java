//TAMPILKAN BILANGAN2 YANG DUPLIKASI PADA ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray10Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 14, 36, 56, 77, 18, 29, 49, 14};
		int[] temp = new int[numbers.length];
		int x=1, f=0;

		System.out.print("Bilangan pada arr1 adalah: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}	

		for( int firstInd=0; firstInd < (numbers.length-1); firstInd++){ //Bertujuan untuk melakukan pengulangan proses A sebanyak jumlah data pada array 
																		//numbers dengan penunjuk index bernama firstInd dengan nilai index dimulai dari 0
																		//dan bertambah sebesar 1 setelah proses A selesai
			// Awal proses A
			for ( int secInd=x; secInd < numbers.length; secInd++){ //melakukan pengulangan proses B diinisiasi dengan secInd yang bernilai 1 dan
			// mengulang jumlah elemen pada array numbers  dan bertambah 1 setelah proses selesai
				

				//Awal Proses B
				int nilai = numbers[firstInd]; 
				int nilaiBanding = numbers[secInd];
				if(nilai == nilaiBanding){
					boolean ada = false;
					
					for(int tempInd=0; tempInd < temp.length; tempInd++){
						int nilaiDuplikat = temp[tempInd]; //nilai duplikat yang berada pada index tempInd pada array temp
						if(nilai == nilaiDuplikat){
							ada = true;
							break;
						}
					}

					if (!ada) {						
						temp[f] = nilaiBanding;
						f++;
					}
					break;
				}
				//Akhir proses B	

			}
			x += 1; 
			// Akhir proses A
		}	

		System.out.println("Bilangan yang diduplikasi adalah: ");		

		for (int z=0; z < f; z++){
			System.out.println(temp[z]);
		}
	}
}