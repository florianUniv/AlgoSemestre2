package cours1;

public class EstTrie {
	
	public static boolean estTrie(int []tab, int debut) {
		
		if(debut >= tab.length-1)
			return true;
		if(tab[debut] > tab[debut + 1])
			return false;
		return  estTrie(tab,debut+1);
	

	}
	
	static boolean estTrie(int[]t) {
		return estTrie(t,0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []tab = {1,5,3,4,5};
		
		if(estTrie(tab)) {
			System.out.println("hello");
		}
	}

}
