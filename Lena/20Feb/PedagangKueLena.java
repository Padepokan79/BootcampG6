public class PedagangKueLena{
	public static void main(String[] args) {

		int kue=200;

		for(int i=0;i<450;i+=15){
			kue-=3;
		}

		System.out.println("Kue yang tersisa: "+kue);
	}
}