package cours2;

import java.util.Iterator;

public class ListeChainePile<E> implements Pile<E> {

	class Noeud{
		E elem;
		Noeud prec;
		
		Noeud(E elem, Noeud prec){
			this.elem = elem;
			this.prec = prec;
		}
	}
	
	private Noeud sp;
	private int nbElem;
	
	public ListeChainePile() {
		sp = null;
		nbElem = 0;
	}
	@Override
	public boolean empiler(E elem) {
		new Noeud(elem, sp);
		nbElem++;
		return true;
	}

	@Override
	public E depiler() {
		if(estVide()){
			return null;
		}
		E ret = sp.elem;
		sp = sp.prec;
		nbElem--;
		return ret; 
	}

	@Override
	public E sommet() {
		
		if(estVide())
			return null;
		
		return sp.elem;
	}

	@Override
	public boolean estVide() {
			return (sp == null);
	}

	@Override
	public int nbElem() {
		// TODO Auto-generated method stub
		return nbElem;
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
