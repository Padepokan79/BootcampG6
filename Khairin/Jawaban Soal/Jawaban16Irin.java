//SOAL 16

public class Jawaban16Irin{  
	public static void main(String args[]){  
	//Membuat 2 matriks  
	int a[][]={{1,3,4},{3,4,5}};  
	int b[][]={{1,3,4},{3,4,5}};  
	  
	//Matriks lain untuk menjumlahkan kedua matriks  
	int c[][]=new int[2][3];  
	  
	//Menambah dan menampilkan tambahan dari 2 matriks  
	for(int i=0;i<2;i++){  
		for(int j=0;j<3;j++){  
			c[i][j]=a[i][j]+b[i][j];  
			System.out.print(c[i][j]+" ");  
		}  	
	System.out.println();
	}  
	  
	}
}  