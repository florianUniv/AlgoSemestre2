package cours2;

public class Decomposition {

	private static void afficheDecomposition(int n, String res) {
		if(n == 0) {
			System.out.println(res);
			return;
		}
		
		for(int i = 1; i <=n; i++) {
			afficheDecomposition(n-i,res+""+i);
			
		}
	}
	
	public static void afficheDecompostion(int n) {
		afficheDecomposition(n,"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afficheDecompostion(5);
	}

}
