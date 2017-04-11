package perf;

import java.util.ArrayList;

public class depth_first_search {
	public static ArrayList<Path> yollar = new ArrayList<Path>();
	public static ArrayList<String> dugumler = new ArrayList<String>();

	public static void main(String[] args) {
//initialize topology

		dugumler.add("A");
		dugumler.add("B");
		dugumler.add("C");
		dugumler.add("D");
		dugumler.add("E");
		dugumler.add("F");
		dugumler.add("G");


		yollar.add(new Path(5,"A","D"));
		yollar.add(new Path(7,"A","B"));
		yollar.add(new Path(8,"B","C"));
		yollar.add(new Path(7,"B","E"));
		yollar.add(new Path(9,"E","G"));
		yollar.add(new Path(11,"G","F"));
		yollar.add(new Path(8,"E","F"));
		yollar.add(new Path(6,"D","F"));
		yollar.add(new Path(15,"D","E"));
		yollar.add(new Path(9,"D","B"));
		yollar.add(new Path(5,"E","C"));


		ArrayList<String> gezilenDugumler = new ArrayList<String>();
		String baslangicNoktasi = new String("D");
		String arananDugum = new String("G");
		ArrayList<Path> gidilenYollar = new ArrayList<Path>();
		gezilenDugumler.add(baslangicNoktasi);
		
		gidilenYollar = ara(gezilenDugumler,arananDugum);
		
		int toplamGezilenYol=0;
		for (Path path : gidilenYollar) {
			System.out.println(path.getAnoktasi()+" : "+ String.valueOf(path.getUzunluk())+" : " + path.getBnoktasi());
			toplamGezilenYol+=path.getUzunluk();
		}
			System.out.println("Toplam Gezilen Yol = " + String.valueOf(toplamGezilenYol));
	}
	
	public static ArrayList<Path> ara(ArrayList<String> baslangicNoktasi, String arananDugum) {
		System.out.println(baslangicNoktasi);
		ArrayList<Path> dugumeBagliYollar = GetWaysFrom(baslangicNoktasi.get(baslangicNoktasi.size()-1));
		ArrayList<Path> hedefeGidenYollar = new ArrayList<Path>();
		for (Path yol : dugumeBagliYollar) {
			if(yol.getBnoktasi().equals(arananDugum)){
				hedefeGidenYollar.add(yol);
				return hedefeGidenYollar;
			}
			else if((!baslangicNoktasi.contains(yol.getBnoktasi()))){
				hedefeGidenYollar.add(yol);
				baslangicNoktasi.add(yol.getBnoktasi());
				hedefeGidenYollar.addAll(ara(baslangicNoktasi,arananDugum));
				return hedefeGidenYollar;
			}
		}
		return hedefeGidenYollar;
	}

	public static ArrayList<Path> GetWaysFrom(String dugum){
		ArrayList<Path> alternativePaths = new ArrayList<Path>();
		for (Path yol : yollar) {
			if(yol.getAnoktasi().equals(dugum) || yol.getBnoktasi().equals(dugum))
			{
				if(yol.getBnoktasi().equals(dugum))
				{
					String tmp = new String(yol.getAnoktasi());
					yol.setAnoktasi(dugum);
					yol.setBnoktasi(tmp);
				}
				alternativePaths.add(yol);
			}
		}
		return alternativePaths;
	}
}

