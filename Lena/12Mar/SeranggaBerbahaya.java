
public class SeranggaBerbahaya extends KelasSerangga{
	String serangan;
	
	void displaySeranggaBerbahaya() {
		displayOrdo();
		System.out.println("Berbahaya/Tidak: Ya");
		System.out.println("Melakukan serangan dengan cara: "+serangan);
	}
}
