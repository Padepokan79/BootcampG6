
public interface UangLembur {
	//rumus lembur =  berapaJam x 1,5 x 1/173 x Gaji Sebulan (Gaji Pokok + Tunjangan Pegawai);
	double nilaiPembagian = 173;
	double RUMUSPERKALIANLEMBUR = 1.5 * (1/nilaiPembagian);
	
	double hitungUangLembur();
}

