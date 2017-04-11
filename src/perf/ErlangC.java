package perf;

public class ErlangC {

	public static void main(String[] args) {
		/*
		 * A is the total traffic offered in units of erlangs
		 * N is the number of servers
		 * PW is the probability that a customer has to wait for service.
		 * 
		 * P_W = (((A^N)/(N!) * (N)/(N - A)) / ( \sum(i=0)^(N-1) (A^i)(i!) ) + (A^N)/(N!) * (N)/(N - A))
		 */

		double a=1.0,Pw=0.0;
		int n = 5;
		
		
		for(int i = 1; i< n; i++){
			//Pw+=a^i/i!
		}
		
	}

}
