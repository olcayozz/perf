import java.util.ArrayList;

public class breadth_first_search {
	private static ArrayList<Path> yollar = new ArrayList<Path>();
	private static ArrayList<String> dugumler = new ArrayList<String>();

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
		gezilenDugumler.add(baslangicNoktasi);
		
		ArrayList<Path> gezilenYollar = ara(gezilenDugumler,arananDugum,new ArrayList<Path>());
		
		int toplamGezilenYol=0;
		for (Path path : gezilenYollar) {
			System.out.println(path.getAnoktasi()+" : "+ String.valueOf(path.getUzunluk())+" : " + path.getBnoktasi());
			toplamGezilenYol+=path.getUzunluk();
		}
			System.out.println("Toplam Gezilen Yol = " + String.valueOf(toplamGezilenYol));
	}
	
	public static ArrayList<Path> ara(ArrayList<String> baslangicNoktasi, String arananDugum, ArrayList<Path> gezilenYollar) {
		System.out.println(baslangicNoktasi);
		ArrayList<String> yeniBaslangicNoktasiSerisi = new ArrayList<String>();
		boolean buldum=false;
		
		for (int i = 0; i<baslangicNoktasi.size();i++){
			ArrayList<Path> dugumeBagliYollar = GetWaysFrom(baslangicNoktasi.get(i));
			for (Path yol : dugumeBagliYollar) {
				gezilenYollar.add(yol);
				yeniBaslangicNoktasiSerisi.add(yol.getBnoktasi());
				//System.out.println(yol.getBnoktasi());
				if(yol.getBnoktasi().equals(arananDugum)){
					buldum=true;
					return gezilenYollar;
				}
			}
		}
		
		if(!buldum){
			gezilenYollar= ara(yeniBaslangicNoktasiSerisi, arananDugum, gezilenYollar);
		}
		return gezilenYollar;
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

