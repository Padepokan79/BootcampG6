import java.util.Scanner;

public class FengShuiHpLena{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

		String noHp, tmp;


		System.out.print("Masukkan no.hp anda: ");
		noHp=keyboard.next();

		for(int i=0; i<noHp.length(); i++){
			tmp=noHp.substring(i,i+1);

			System.out.print(tmp);

			if(tmp.equals("0")){
				System.out.println("\tkhusus, special, langka");
			}
			else if(tmp.equals("1")){
				System.out.println("\tsatu, satu-satunya, diri sendiri");
			}
			else if(tmp.equals("2")){
				System.out.println("\tmudah, gampang, tidak sulit");
			}
			else if(tmp.equals("3")){
				System.out.println("\tmenemukan, mendapatkan, hidup");
			}
			else if(tmp.equals("4")){
				System.out.println("\tmati, miskin, susah");
			}
			else if(tmp.equals("5")){
				System.out.println("\ttidak akan, tidak pernah, tidak bisa");
			}
			else if(tmp.equals("6")){
				System.out.println("\tmenuju, akan");
			}
			else if(tmp.equals("7")){
				System.out.println("\ttempat, hoki, atau bisa disebut juga ketuhanan");
			}
			else if(tmp.equals("8")){
				System.out.println("\tmakmur");
			}
			else if(tmp.equals("9")){
				System.out.println("\tsukses");
			}
		}
	}
}