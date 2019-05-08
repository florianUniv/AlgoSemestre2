package cours3;

import java.util.Iterator;



public class Main {
	public static void main(String args[]) {
		/*TabDynamique t= new TabDynamique(5);
		
		
		
		System.out.println(t.empiler(5));
		System.out.println(t.depiler());
		System.out.println(t.estVide());
		*/
	
		
//		File<String> p= new ListeChaineFile<String>();
		File<String> p= new TabStatiqueFile<String>(4);

		p.ajouter("a");
		p.ajouter("b");
		p.ajouter("c");
		p.ajouter("d");
		System.out.println("ret: " + p.retirer());
		System.out.println("ret: " + p.retirer());
		System.out.println("ret: " + p.retirer());
		System.out.println("ret: " + p.retirer());
		p.ajouter("e");
		p.ajouter("f");
		System.out.println("ret: " + p.retirer());
		System.out.println("ret: " + p.retirer());
		
		Iterator<String> it = p.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		
		
		
		
	}
	
}