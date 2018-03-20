package soal6TokoPakaian;

import java.util.ArrayList;

public class TestTokoPakaian {
	public static void main(String[] args) {
		Pakaian kemeja = new Pakaian("Kemeja", 70000);
		Pakaian celana = new Pakaian("Celana", 110000);
		Pakaian kaos = new Pakaian("Kaos", 50000);
		Pakaian jas = new Pakaian("Jas", 500000);
		
		ArrayList<Integer> listKemeja = new ArrayList<Integer>();
		insertToAddList(listKemeja, 20, 15);
		
		ArrayList<Integer> listCelana = new ArrayList<Integer>();
		insertToAddList(listCelana, 5, 10);
		
		ArrayList<Integer> listKaos = new ArrayList<Integer>();
		insertToAddList(listKaos, 30, 25);
		
		ArrayList<Integer> listJas = new ArrayList<Integer>();
		insertToAddList(listJas, 11, 7);
		
		ArrayList<String> listHari = new ArrayList<String>();
		insertToAddList(listHari, "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu");
		
		int totalPendapatanPerhari, totalPendapatan = 0;
		
		System.out.println("Pendapatan tiap hari di minggu pertama:");
		for(int i = 0; i<7;i++) {
			totalPendapatanPerhari = listCelana.get(0)*celana.getHarga() + listJas.get(0)*jas.getHarga() + listKaos.get(0)*kaos.getHarga() + listKemeja.get(0)*kemeja.getHarga();
			System.out.println(listHari.get(i)+" : "+totalPendapatanPerhari);
			
			totalPendapatan += totalPendapatanPerhari;
		}
		
		for(int i = 0; i<4;i++) {
			totalPendapatanPerhari = listCelana.get(1)*celana.getHarga() + listJas.get(1)*jas.getHarga() + listKaos.get(1)*kaos.getHarga() + listKemeja.get(1)*kemeja.getHarga();
			
			totalPendapatan += totalPendapatanPerhari;
		}
		
		System.out.println("\nPendapatan selama 2 minggu: "+totalPendapatan);
		
		
	}
	
	public static void insertToAddList(ArrayList<Integer> namaList, int nilai1, int nilai2) {
		namaList.add(nilai1);
		namaList.add(nilai2);
	}
	
	public static void insertToAddList(ArrayList<String> namaList, String nilai1, String nilai2, String nilai3, String nilai4, String nilai5, String nilai6, String nilai7) {
		namaList.add(nilai1);
		namaList.add(nilai2);
		namaList.add(nilai3);
		namaList.add(nilai4);
		namaList.add(nilai5);
		namaList.add(nilai6);
		namaList.add(nilai7);
	}
}
