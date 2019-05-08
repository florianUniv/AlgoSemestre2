package cours3;

import java.util.Iterator;

public class TabStatiqueFile<E> implements File<E> {
	int deb;
	int fin;
	E[] t;

	public TabStatiqueFile(int taille) {
		t = (E[]) new Object[taille + 1];
		this.deb = 0;
		this.fin = 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	@Override
	public boolean ajouter(E elem) {
		// TODO Auto-generated method stub

		t[fin] = elem; // à l'indice fin + 1, on ajoute l'elem
		fin = (fin + 1) % t.length; // on décalle fin à l'indice fin +1
		if (fin == deb) { // test si le début = fin
			deb = (deb + 1) % t.length; // décallage du début de 1
			return false;
		}
		return true;
	}

	@Override
	public E retirer() {
		if (estVide())
			return null;
		
		E elem = t[deb];
		deb = (deb + 1) % t.length; // décallage du début de 1
		return elem;

	}

	@Override
	public E prochain() {
		// TODO Auto-generated method stub
		if (estVide())
			return null;

		return (t[deb]);

	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return (deb == fin);
	}

	@Override
	public int nbElem() {
		// TODO Auto-generated method stub
		return (fin - deb + t.length) % t.length;
	}

	 class Itr implements Iterator<E> {
		int tmp;
		
		public Itr() {
			tmp = deb;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (tmp != fin);
		}

		@Override
		public E next() {
			E e = t[tmp];
			tmp = (tmp + 1) % t.length;
			return e;
		}

	}

}
