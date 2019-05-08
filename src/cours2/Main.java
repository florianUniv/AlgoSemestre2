package cours2;

import java.util.Iterator;

public class Main {
	public static void main(String args[]) {
		/*TabDynamique t= new TabDynamique(5);
		
		
		
		System.out.println(t.empiler(5));
		System.out.println(t.depiler());
		System.out.println(t.estVide());
		*/
	
		
		Pile<String> p= new PileTabStatique<String>(3);
		
		p.empiler("a");
		p.empiler("b");
		p.empiler("c");
		System.out.println(p.sommet());
		Iterator<String> it = p.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		
		
	}
	
}