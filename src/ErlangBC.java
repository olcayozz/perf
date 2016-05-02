
public class ErlangBC {

	public static void main(String[] args) {
		double m = 3.0;
		double E = 60;
		
		double upper = ussu(E, m)/faktoriyel(m);
		double lower = 0.0;
		
		for(int i=0; i<=m;i++)
			lower+=ussu(E, i)/faktoriyel(i);
		
		double erlangB = upper/lower;
		double erlangC = erlangB / ((1-E/m) * (1-erlangB));
		
		System.out.println("  m = " + String.valueOf(m) + "\n" + 
				"  E = " + String.valueOf(E) + "\n" +
				"ErlangB = " + String.valueOf(erlangB) + "\n" +
				"ErlangC = " + String.valueOf(erlangC));
		
	}
	public static double faktoriyel(double sayi)
	{
		double toplam = 1;
		for(int i =1 ; i<sayi;i++)
		{
			toplam*=i;
		}
		return toplam;
	}
	public static double ussu(double sayi, double us){
		double tmp=sayi;
		for(int i=1;i<us;i++){
			tmp*=sayi;
		}
		return tmp;
	}

}
