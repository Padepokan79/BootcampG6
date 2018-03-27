/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public class Golongan4 extends PNS {

	public Golongan4(Pegawai pegawai) {
		// TODO Auto-generated constructor stub
		pegawai.setGajiPokok(hitungGajiPokok(pegawai.kodeGolongan, pegawai.masaKerja));
		pegawai.setPotonganTaperum(hitungPotonganTaperum());
		
		Pegawai pnsGolongan4 = new Pegawai(pegawai);
	}
	
	@Override // method hitungGajiPokok()
	public int hitungGajiPokok(String kodeGolongan, int masaKerja) {
		// TODO Auto-generated method stub
		int gajiPokok = 0;
		
		switch (kodeGolongan) {
			case "A":
				for (int i = 0; i < gajiGol4A.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol4A[i];
					}
				}
				
				break;
				
			case "B":
				for (int i = 0; i < gajiGol4B.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol4B[i];
					}
				}
				
				break;
				
			case "C":
				for (int i = 0; i < gajiGol4C.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol4C[i];
					}
				}
				
				break;
				
			case "D":
				for (int i = 0; i < gajiGol4D.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol4D[i];
					}
				}
				
				break;
				
			case "E":
				for (int i = 0; i < gajiGol4E.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol4E[i];
					}
				}
				
				break;
		}
		
		return gajiPokok;
	}

	@Override // method hitungPotonganTaperum()
	public int hitungPotonganTaperum() {
		// TODO Auto-generated method stub
		return potonganTaperumGolongan4;
	}

}
