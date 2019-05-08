package cours2;

public interface Pile<E> extends Iterable<E> {

	boolean empiler(E elem);
	E depiler();
	E sommet();
	boolean estVide();
	int nbElem();
	
}
