class Mobil {
	double awal;
	double singgah;
	double gallons;
	
	Mobil (int start){
		awal = start;
	}
	void fillUp(int lanjut, double galls) {
		singgah = lanjut;
		gallons  = galls;
	}
	double calculatedMPG() {
		return (singgah - awal)/gallons;
	}
	boolean gasHog() {
		if (calculatedMPG()<= 15) {
			return true;
		}else {
			return false;
		}
	}
	boolean ekonomis() {
		if (calculatedMPG()>=35) {
			return true;
		}else{
			return false;
		}
	}
	void timpa() {
		awal = singgah;
	}
}
