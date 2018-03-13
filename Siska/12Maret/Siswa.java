
public class Siswa {
		int id;
		String name;
		
		Siswa (){
			
		}
		
		Siswa (int idnya, String namanya){
			id = idnya;
			name = namanya;
		}
		
		void buatData (int i, String n) {
			id = i;
			name = n;
		}
		
		void menampilkanInformasi () {
			System.out.println(id + " " + name);
		}
	}
