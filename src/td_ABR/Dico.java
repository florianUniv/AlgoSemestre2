package cours4;

import java.util.List;

public interface Dico<K,V> {
	V ajouter(K cle,V valeur); //retourne null si la clé a été créee l'ancienne valeur si la clé existait 
	V rechercher (K cle); //null si la cle n'existe pas
	boolean contient(K cle);
	V supprimer (K cle); //null si la cle n'existe pas sinon l'ancienne valeur
	boolean estVide();
	int nbElem();
	List<K> listDesCles();
	boolean necessiteReorg();
	void reorganiser();
	
}
