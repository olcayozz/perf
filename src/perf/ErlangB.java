package perf;

public class ErlangB {

	public static void main(String[] args) {
		/*
		 * 
		 * P_b = B(E,m) = (E^m/m!) / sum_{i=0}^m {E^i}/{i!} 
		 * P_b is the probability of blocking
		 * m is the number of identical parallel resources such as servers, telephone lines, etc.
		 * E = λh is the normalised ingress load (offered traffic stated in erlang).
		 */
		
		
		double e=1.0,InvB=1.0;
		int m=60;
		
		for(int i = 1; i <= m; i++){
			InvB=1.0+InvB*i/e;
		}

		System.out.println("e = " + String.valueOf(e) + "\nm = " + String.valueOf(m) + "\nperf.ErlangB = " + String.valueOf(1.0/InvB));

	}

}
