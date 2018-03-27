/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public class Golongan2 extends PNS {

	public Golongan2(Pegawai pegawai) {
		// TODO Auto-generated constructor stub
		pegawai.setGajiPokok(hitungGajiPokok(pegawai.kodeGolongan, pegawai.masaKerja));
		pegawai.setPotonganTaperum(hitungPotonganTaperum());
		
		Pegawai pnsGolongan2 = new Pegawai(pegawai);
	}
	
	@Override // method hitungGajiPokok()
	public int hitungGajiPokok(String kodeGolongan, int masaKerja) {
		// TODO Auto-generated method stub
		int gajiPokok = 0;
		
		switch (kodeGolongan) {
			case "A":
				for (int i = 0; i < gajiGol2A.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol2A[i];
					}
				}
				
				break;
				
			case "B":
				for (int i = 0; i < gajiGol2B.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol2B[i];
					}
				}
				
				break;
				
			case "C":
				for (int i = 0; i < gajiGol2C.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol2C[i];
					}
				}
				
				break;
				
			case "D":
				for (int i = 0; i < gajiGol2D.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol2D[i];
					}
				}
				
				break;
		}
		
		return gajiPokok;
	}

	@Override // method hitungPotonganTaperum()
	public int hitungPotonganTaperum() {
		// TODO Auto-generated method stub
		return potonganTaperumGolongan2;
	}

}
