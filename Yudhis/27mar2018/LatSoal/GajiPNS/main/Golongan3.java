/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public class Golongan3 extends PNS {

	public Golongan3(Pegawai pegawai) {
		// TODO Auto-generated constructor stub
		pegawai.setGajiPokok(hitungGajiPokok(pegawai.kodeGolongan, pegawai.masaKerja));
		pegawai.setPotonganTaperum(hitungPotonganTaperum());
		
		Pegawai pnsGolongan3 = new Pegawai(pegawai);
	}
	
	@Override // method hitungGajiPokok()
	public int hitungGajiPokok(String kodeGolongan, int masaKerja) {
		// TODO Auto-generated method stub
		int gajiPokok = 0;
		
		switch (kodeGolongan) {
			case "A":
				for (int i = 0; i < gajiGol3A.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol3A[i];
					}
				}
				
				break;
				
			case "B":
				for (int i = 0; i < gajiGol3B.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol3B[i];
					}
				}
				
				break;
				
			case "C":
				for (int i = 0; i < gajiGol3C.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol3C[i];
					}
				}
				
				break;
				
			case "D":
				for (int i = 0; i < gajiGol3D.length; i++) {
					if (masaKerja == i) {
						gajiPokok = gajiPokok + gajiGol3D[i];
					}
				}
				
				break;
		}
		
		return gajiPokok;
	}

	@Override // method hitungPotonganTaperum()
	public int hitungPotonganTaperum() {
		// TODO Auto-generated method stub
		return potonganTaperumGolongan3;
	}

}
