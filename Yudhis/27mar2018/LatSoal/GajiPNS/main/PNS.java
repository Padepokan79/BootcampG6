/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public abstract class PNS extends Pegawai implements GajiPokok {
	
	// Method abstract penghitungan gajiPokok dan potonganTaperum
	public abstract int hitungGajiPokok(String kodeGolongan, int masaKerja);
	public abstract int hitungPotonganTaperum();
	
}
