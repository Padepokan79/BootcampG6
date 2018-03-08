public class SoalNo10{
	public static void main(String[] args) {
		int [] arr = {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26};
		int [] arr0 = new int[7];
		int [] arrTemp = new int[8];
		int index1 = 0, index2=0, index3 =0, temp;

		System.out.println("10. Urutkan nilai array dari kecil ke besar dan simpan nilai 0 di akhir array.\n");

		System.out.println("Array before: ");
		for(int angka : arr){
			System.out.print(angka +", ");
		}

		for(int angka : arr){
			if (angka == 0){
				arr0[index1]=angka;
				index1++;
			}else{
				arrTemp[index2]=angka;
				index2++;
			}
		}

		for(int i=0; i<arrTemp.length; i++){
			for(int j=arrTemp.length-1; j>i;j--){
				if(arrTemp[j]<arrTemp[j-1]){
					temp=arrTemp[j];
					arrTemp[j]=arrTemp[j-1];
					arrTemp[j-1]=temp;
				}
			}
		}

		for(int i=0; i<arr.length ;i++){
			if(i<arrTemp.length){
				arr[i]=arrTemp[i];
			}else{
				arr[i]=arr0[index3];
				index3++;
			}
		}

		System.out.println("\n\nArray after: ");
		for(int angka : arr){
			System.out.print(angka +", ");
		}
	}
}