//3. Buatlah program untuk menampilkan isi array dalam bentuk persegi seperti berikut, isi array random (0-9), panjang array 9. Contoh :

public class Jawaban03Irin {
	public static void main(String[] args) {  
  		int arr[] = new int[9]; 
		

		for(int i=0;i<3;i++){	
		arr[i] = 1 + (int) (Math.random()*10);  
		 for(int j=0;j<3;j++){
		 arr[j] = 1 + (int) (Math.random()*10);  
		   System.out.print(arr[i]+ arr[j] + " ");    
		 }  
		 System.out.println();   
		}  
		  
		} 

	}
