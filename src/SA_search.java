import java.util.ArrayList;

public class SA_search {
	private static ArrayList<Path> yollar = new ArrayList<Path>();
	private static ArrayList<String> dugumler = new ArrayList<String>();

	public static void main(String[] args) {
		initializeTopology();
		
		int MAX=5;
		String baslangicNoktasi = new String("A");
		String arananDugum = new String("G");
		ArrayList<String> gezilenDugumler = new ArrayList<String>();
		gezilenDugumler.add(baslangicNoktasi);
		
		ArrayList<Path> gidilenYollar = new ArrayList<Path>();
		gidilenYollar = ara(gezilenDugumler,arananDugum);
		ArrayList<Path> EnIyiDurum = gidilenYollar;//Fonksiyonun ilk degeri
		
		int energy = calcEnergy(EnIyiDurum);
		int EnIyiEnerji = energy;
		ArrayList<Path> l_durum = new ArrayList<Path>();
		
		for(int i = 1 ; i<=MAX ; i++){
			gezilenDugumler.removeAll(gezilenDugumler);
			l_durum.removeAll(l_durum);
			gezilenDugumler.add(baslangicNoktasi);
			l_durum = ara(gezilenDugumler,arananDugum);
			int l_energy = calcEnergy(l_durum);
			if(l_energy<EnIyiEnerji)
			{
				EnIyiDurum.removeAll(EnIyiDurum);
				EnIyiDurum = l_durum;
				EnIyiEnerji = l_energy;
			}
		}
		
		for (Path path : EnIyiDurum) {
			System.out.println(path.getAnoktasi() + " : "+ String.valueOf(path.getUzunluk()) + " : " + path.getBnoktasi());
		}
			System.out.println("Toplam Gezilen Yol = " + String.valueOf(EnIyiEnerji));

	}
	
	public static int calcEnergy(ArrayList<Path> durum){
		int toplamGezilenYol = 0;	//fonksiyonun enerjisi
		for (Path path : durum) {
			System.out.println(path.getAnoktasi() + " : " + String.valueOf(path.getUzunluk()) + " : " + path.getBnoktasi());
			toplamGezilenYol+=path.getUzunluk();
		}
		return toplamGezilenYol;
	}
	
	public static void initializeTopology()
	{
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
	}
	
	public static ArrayList<Path> ara(ArrayList<String> baslangicNoktasi, String arananDugum) {
		//System.out.println(baslangicNoktasi);
		ArrayList<Path> dugumeBagliYollar = GetWaysFrom(baslangicNoktasi.get(baslangicNoktasi.size()-1));
		ArrayList<Path> hedefeGidenYollar = new ArrayList<Path>();
		
		Path yol = dugumeBagliYollar.get(Utility.randomGenerator()%dugumeBagliYollar.size());
		
			if(yol.getBnoktasi().equals(arananDugum)){
				hedefeGidenYollar.add(yol);
				System.out.println("BULDUM  : " +yol.getBnoktasi());
				return hedefeGidenYollar;
			}
			else //if((!baslangicNoktasi.contains(yol.getBnoktasi())))
				{
				hedefeGidenYollar.add(yol);
				baslangicNoktasi.add(yol.getBnoktasi());
				hedefeGidenYollar.addAll(ara(baslangicNoktasi,arananDugum));
				return hedefeGidenYollar;
			}
		
		//return hedefeGidenYollar;
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

