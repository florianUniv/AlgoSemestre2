package cours3;

public interface File<E> extends Iterable<E>{

	boolean ajouter(E elem);//Si plein on perd le + vieux et on renvoie false
	E retirer(); //null si file vide
	E prochain();
	boolean estVide();
	int nbElem();
}