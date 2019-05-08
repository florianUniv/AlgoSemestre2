package cours3;

import java.util.Iterator;

public class ListeChaineFile<E> implements File<E> {

	class Noeud{
		E elem;
		Noeud suiv;
		
		 Noeud(E elem, Noeud suiv){
			this.elem = elem;
			this.suiv = suiv;
		}
	}
	
	private Noeud debut;
	private Noeud fin;
	private int nbElem;
	
	public ListeChaineFile() {
		this.debut = null;
		this.fin = null;
		this.nbElem = 0;
	}
	
	@Override
	public Iterator iterator() {
		return new Itr();
	}

	@Override
	public boolean ajouter(E elem) {
		Noeud noeud = new Noeud(elem, null);
		if(estVide())
			debut = noeud;
		else
			fin.suiv = noeud;
		fin = noeud;
		nbElem++;
		
		return true;
	}

	@Override
	public E retirer() {
		if(estVide())
			return null;
		
		E elemRetirer = debut.elem;
		debut = debut.suiv;
		nbElem--;
		
		return elemRetirer;
	}

	@Override
	public E prochain() {
		if(estVide())
			return null;
		return debut.elem;
	}

	@Override
	public boolean estVide() {
		return (debut == null);
	}

	@Override
	public int nbElem() {
		return nbElem;
	}
	
class Itr implements Iterator<E> {
		Noeud courant;
		
		Itr(){
			courant = debut;
		}
		
		public boolean hasNext() {
			return (courant!=null);
		}
		
		public E next() {
			if(hasNext()) {
				E ret = courant.elem;
				courant = courant.suiv;
				return ret;
			}
			else
				return null;
		}
	}

}
