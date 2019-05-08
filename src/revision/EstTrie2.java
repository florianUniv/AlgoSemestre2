package revision;

public class EstTrie2 {
	/**
	 * recherche de la récursivité, elle doit décrementer
	 * la on prend une suite de nombre et on vérifie si celui d'avant et superieur à celui d'après
	 * si
	 * @param args
	 */
	
	public static boolean estTrie(int []tab, int debut) {
		if(debut >= tab.length-1)
			return true;
		
		if(tab[debut] > tab[debut+1])
			return false;
		
		return estTrie(tab,debut+1);
		
					
	}
	
	public static boolean estTrie(int[] tab) {
		return estTrie(tab, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []tab = {1,5,3,4};
		
		if(estTrie(tab)) {
			System.out.println("hello");
		}
	}

}
