package revision;

public class Puissance2 {

	public static int puissance(int p, int n) {
		if(n == 0)
			return 1;
		if(n % 2 == 0)
			return puissance(p*p,n/2);
		
		return puissance(p, n-1)*p;
	}
}
