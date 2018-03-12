class Karyawan {
	int noId;
	String nama;
	float gajiPokok;
	
	void input(int nId,String nmKaryawan,float gapok) {
		noId= nId;
		nama = nmKaryawan ;
		gajiPokok = gapok;
	}
	void tampil() {
		System.out.println(noId +" "+ nama + " "+ gajiPokok);}
}
