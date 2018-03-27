package quizOOP;

public interface InterfacePPH {
	double tarifKurangDari50Juta = 0.05;
	double tarifRange250Juta = 0.15;
	double tarifRange500Juta = 0.25;
	double tarifLebihDari500Juta = 0.3;
	
	double rangeLapisPertama = 50000000;
	double rangeLapisKedua = 200000000;
	double rangeLapisKetiga = 250000000;
	
	public double mencariPPH();
}
