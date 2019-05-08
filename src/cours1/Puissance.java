package cours1;

public class Puissance {
	public static int puissance(int x, int n) {
		
		if(n == 0)
			return 1;
		/*if(n % 2 == 0) 
			return puissance (x*x,n/2);*/
		
		
		return puissance(x, n-1)*x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 10;
		
		System.out.println(puissance(x,n));
	}

}
