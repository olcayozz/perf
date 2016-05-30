import java.util.ArrayList;
import java.util.Comparator;

public class Prim_v2 {
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
		

		//D dugumu baslangic noktasi olarak secilecek.
		ArrayList<Path> alternatifYollar = new ArrayList<Path>();
		ArrayList<Path> gezilenYollar = new ArrayList<Path>();
		ArrayList<String> gezilenDugumler = new ArrayList<String> ();
		gezilenDugumler.add("D");

		do{
			for (int i = 0; i< gezilenDugumler.size() ; i++) {
				String dugum = gezilenDugumler.get(i);
				for (Path komsuDugumeGidenYol : GetWaysFrom(dugum)) {
					if(!gezilenDugumler.contains(komsuDugumeGidenYol.getBnoktasi()))
						alternatifYollar.add(komsuDugumeGidenYol);
				}
			}
			alternatifYollar.sort(new Comparator<Path>() { //olasi butun guzergahlar uzunluklarına gore sıralanır.
				public int compare(Path c1, Path c2){
				return Integer.compare(c1.getUzunluk(),c2.getUzunluk());
				}
			});
			String gidilecekDugum = alternatifYollar.get(0).getBnoktasi();
			if(!gezilenDugumler.contains(gidilecekDugum)){
				gezilenYollar.add(alternatifYollar.get(0));
				alternatifYollar.removeAll(alternatifYollar);
				gezilenDugumler.add(0, gidilecekDugum);
			}
		}while(gezilenDugumler.size()<dugumler.size());
			
		for (Path path : gezilenYollar) {
			System.out.println(path.getAnoktasi()+" : "+ String.valueOf(path.getUzunluk())+" : " + path.getBnoktasi());
		}
		/*
		for (String dugum : gezilenDugumler) {
			System.out.println("gezildi  : "  + dugum);
		}
		*/
		  
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

