import java.util.HashMap;
import java.util.Random;

public class TestPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing kertasBiasa = new Printing("Kertas Biasa", 4000, 100);
		Printing banner = new Printing("Banner", 80000, 30, 2, 1, 10000);
		Printing baliho = new Printing("Baliho", 150000, 20, 3, 3, 20000);
		Random pembeli = new Random();		
		HashMap<Integer, Integer> pembeliKertasBiasa = new HashMap<Integer, Integer>();
		
		long totalPendatanPerhariKertas = 0, totalPendatanPerhariBanner = 0, totalPendatanPerhariBaliho = 0, totalPendatanPerhari = 0;
		
		for (int pengunjungKe = 1; pengunjungKe <= kertasBiasa.getRataRataPengunjungPerhari(); pengunjungKe++) {
			kertasBiasa.setJumlahKertas(pembeli.nextInt(10)+1);
			System.out.print("Pengunjung Ke " + pengunjungKe + " Memprint " + kertasBiasa.getJumlahKertas() + " kertas \t");
			System.out.println("Biaya yang harus di bayar Rp." + kertasBiasa.pendapatanPerpengunjung());
			totalPendatanPerhariKertas += kertasBiasa.pendapatanPerpengunjung();
		}
		
		System.out.println("Total Pendapatan Perhari dari Kertas Rp." + totalPendatanPerhariKertas);
		System.out.println();
		
		for (int pengunjungKe = 1; pengunjungKe <= banner.getRataRataPengunjungPerhari(); pengunjungKe++) {
			banner.setPanjang(pembeli.nextInt(2)+2);
			banner.setLebar(pembeli.nextInt(2)+1);
			System.out.print("Pengunjung Ke " + pengunjungKe + " Memprint Banner dengan ukuran " + banner.getPanjang() + " X " + banner.getLebar() + " \t");
			System.out.println("Biaya yang harus di bayar Rp." + banner.pendapatanPerpengunjung());
			totalPendatanPerhariBanner += banner.pendapatanPerpengunjung();
		}
		
		System.out.println("Total Pendapatan Perhari dari Kertas Rp." + totalPendatanPerhariBanner);
		System.out.println();

		for (int pengunjungKe = 1; pengunjungKe <= baliho.getRataRataPengunjungPerhari(); pengunjungKe++) {
			baliho.setPanjang(pembeli.nextInt(2)+3);
			baliho.setLebar(pembeli.nextInt(3)+3);
			System.out.print("Pengunjung Ke " + pengunjungKe + " Memprint Baliho dengan ukuran " + baliho.getPanjang() + " X " + baliho.getLebar() + " \t");
			System.out.println("Biaya yang harus di bayar Rp." + baliho.pendapatanPerpengunjung());
			totalPendatanPerhariBaliho += baliho.pendapatanPerpengunjung();
		}
		
		System.out.println("Total Pendapatan Perhari dari Kertas Rp." + totalPendatanPerhariBaliho);
		System.out.println();
		
		totalPendatanPerhari = totalPendatanPerhariKertas + totalPendatanPerhariBanner + totalPendatanPerhariBaliho;
		System.out.println("Total Pendapatan Perhari dari keseluruhan Rp." + totalPendatanPerhari);
		
			
		
	}

}
