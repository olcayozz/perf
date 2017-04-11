package perf;

import java.util.ArrayList;
import java.util.Comparator;

public class Kruskal_v2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> dugumler = new ArrayList<String>();
		dugumler.add("x");
		dugumler.add("w");
		dugumler.add("u");
		dugumler.add("s");
		dugumler.add("v");
		dugumler.add("y");
		dugumler.add("z");
		dugumler.add("t");
		
		ArrayList<Path> yollar = new ArrayList<Path>();
		ArrayList<Path> gezilenYollar = new ArrayList<Path>();
		
		yollar.add(new Path(3,"x","y"));
		yollar.add(new Path(1,"x","v"));
		yollar.add(new Path(2,"x","w"));
		yollar.add(new Path(1,"w","u"));
		yollar.add(new Path(1,"w","v"));
		yollar.add(new Path(2,"u","s"));
		yollar.add(new Path(3,"u","v"));
		yollar.add(new Path(8,"v","t"));
		yollar.add(new Path(4,"v","y"));
		yollar.add(new Path(5,"y","t"));
		yollar.add(new Path(5,"y","z"));
		yollar.add(new Path(10,"z","t"));
		yollar.add(new Path(4,"t","s"));
		yollar.add(new Path(3,"t","u"));		
		
		
		yollar.sort(new Comparator<Path>() { //olasi butun guzergahlar uzunluklarına gore sıralanır.
			public int compare(Path c1, Path c2){
			return Integer.compare(c1.getUzunluk(),c2.getUzunluk());
			}
		});
		
		
		for (Path path : yollar) { // daha once sıralanmıs tum guzergahlar once en kısa yol gidilecek sekilde gezilmeye baslanir. Ayni yolu tekrar gecme sansimiz yok.
			@SuppressWarnings("unchecked")
			ArrayList<String> dugumlerTmp = (ArrayList<String>) dugumler.clone();
			boolean dway = false;
			for (String d : dugumlerTmp) {
				if(d!=null &&  d.equals(path.getAnoktasi())){
					dugumler.remove(path.getAnoktasi());
					gezilenYollar.add(path);
					dway=true;
				}
				if(d!=null && d.equals(path.getBnoktasi())){
					dugumler.remove(path.getBnoktasi());
					if(!dway)gezilenYollar.add(path);
				}
			}
		}
		
		for (Path path : gezilenYollar) {
			System.out.println(path.getAnoktasi()+" : "+ String.valueOf(path.getUzunluk())+" : " + path.getBnoktasi());
		}
	}
}
