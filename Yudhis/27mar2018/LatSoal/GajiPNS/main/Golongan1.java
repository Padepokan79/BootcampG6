/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public class Golongan1 extends PNS {

	public Golongan1(Pegawai pegawai) {
		// TODO Auto-generated constructor stub
		pegawai.setGajiPokok(hitungGajiPokok(pegawai.kodeGolongan, pegawai.masaKerja));
		pegawai.setPotonganTaperum(hitungPotonganTaperum());
		
		Pegawai pnsGolongan1 = new Pegawai(pegawai);
	}
	
	@Override // method hitungGajiPokok()
	public int hitungGajiPokok(String kodeGolongan, int masaKerja) {
		// TODO Auto-generated method stub
		int gajiPokok = 0;
		
		switch (kodeGolongan) {
			case "A":
				for (int i = 0; i < gajiGol1A.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol1A[i];
					}
				}
				
				break;
				
			case "B":
				for (int i = 0; i < gajiGol1B.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol1B[i];
					}
				}
				
				break;
				
			case "C":
				for (int i = 0; i < gajiGol1C.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol1C[i];
					}
				}
				
				break;
				
			case "D":
				for (int i = 0; i < gajiGol1D.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol1D[i];
					}
				}
				
				break;
		}
		
		return gajiPokok;
	}

	@Override // method hitungPotonganTaperum()
	public int hitungPotonganTaperum() {
		// TODO Auto-generated method stub
		return potonganTaperumGolongan1;
	}

}
