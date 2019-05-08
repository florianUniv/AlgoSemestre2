package cours2;

import java.util.Iterator;

public class PileTabStatique<E> implements Pile<E> {

	protected E []t;
	protected int sp; //Indice de la prochaine case libre
	

	
	@SuppressWarnings("unchecked")
	public PileTabStatique(int taille) {
		t=(E[]) new Object[taille];
		sp = 0;
	}
	
	
	public boolean empiler(E elem) {
		if(sp>=t.length)
			return false;
		
		t[sp++]=elem;
		return true;
	}
	
	public E depiler() { //return (estVide()) ? null:t[--sp]
		if(estVide())
			return null;
		
		return t[--sp];
	}
	
	
	
	public E sommet() {
		if(estVide())
			return null;
		
		return t[sp-1];
	}
	
	
	public boolean estVide() {
		return (sp==0);
	}
	
	public int nbElem() {
		return sp;
	}


	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	public class Itr implements Iterator<E> {
		int tmp=sp;
		
		public boolean hasNext() {
			return (tmp--!=0);
		}
		
		public E next() {
			if(iterator().hasNext()) {
				return t[--sp];
			}
			
			return null;
		}
		
		//le remove() est facultatif et n'a 
	
		
	}
	/*
	 * AVANTAGES
	 * cout des opérations
	 * emplier 0(1)
	 * depiler 0(1)
	 * sommet  0(1)
	 * 
	 * INCONVENIENTS
	 * taille max à connaître (gaspillage mémoire)
	 */

}
