
public class Martabak {
	private String jenisMartabak;
	private double hargaMartabak;
	private int rataRataPenjualanPerhari;
	
	public Martabak(String jenisMartabak, double hargaMartabak) {
		this.setJenisMartabak(jenisMartabak);
		this.setHargaMartabak(hargaMartabak);
	}

	public String getJenisMartabak() {
		return jenisMartabak;
	}

	public void setJenisMartabak(String jenisMartabak) {
		this.jenisMartabak = jenisMartabak;
	}

	public double getHargaMartabak() {
		return hargaMartabak;
	}

	public void setHargaMartabak(double hargaMartabak) {
		this.hargaMartabak = hargaMartabak;
	}

	public int getRataRataPenjualanPerhari() {
		return rataRataPenjualanPerhari;
	}

	public void setRataRataPenjualanPerhari(int rataRataPenjualanPerhari) {
		this.rataRataPenjualanPerhari = rataRataPenjualanPerhari;
	}
	
	
}
