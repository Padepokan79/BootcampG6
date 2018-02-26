import java.util.Scanner;

public class SortingAngkaKe2Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		String angka;
		int index=0,tempLength,temp;
		int [] arr;

		System.out.print("Masukkan kumpulan angka: ");
		angka = keyboard.next();

		tempLength = angka.length();

		if(tempLength%2==0){
			tempLength = tempLength/2;
		}
		else{
			tempLength = tempLength/2 +1;
		}

		arr = new int[tempLength];

		for(int i=0; i<tempLength; i++){
			if(tempLength%2==1 && (index+1) == angka.length()){
				arr[i]=Integer.parseInt(angka.substring(index,index+1));
			}else{
				arr[i]=Integer.parseInt(angka.substring(index,index+2));
				System.out.print(arr[i]+" ");
			}
		}

			
		for(int i=0; i<arr.length; i++){
			for(int j=arr.length-1; j>i;j--){
				if(arr[j]<arr[j-1]){
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}

		System.out.println("\nSorting nilai dari kecil ke besar: ");
		for(int num : arr){
			System.out.print(num+"  ");
		}

		for(int i=0; i<arr.length; i++){
			for(int j=arr.length-1; j>i;j--){
				if(arr[j]>arr[j-1]){
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}

		System.out.println("\nSorting nilai dari besar ke kecil: ");
		for(int num : arr){
			System.out.print(num+"  ");
		}

	}
}