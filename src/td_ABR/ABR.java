package cours4;

import java.util.List;

public class ABR <K extends Comparable<K>, V> implements Dico <K,V>{

	private class Noeud{
		K cle ;
		V valeur;
		ABR<K,V> fg;
		ABR<K,V> fd;
		
		public Noeud(K cle, V valeur) {
			this.cle = cle;
			this.valeur = valeur;
			fg = new ABR<>();
			fd = new ABR<>();
		}
		
	}
	private Noeud racine;
	public ABR() {
		this.racine = null;
	}
	@Override
	public V ajouter(K cle, V valeur) {
		if(estVide()) {
			racine = new Noeud(cle,valeur);
			return null; //return null car comme si nil existait pas
		}
		int cmp = cle.compareTo(racine.cle);
		if(cmp == 0) {
			//V tmp = racine .valeur;
			racine.valeur = valeur;
		}
		
		if(cmp < 0)
			return racine.fg.ajouter(cle, valeur);
		else
			return racine.fd.ajouter(cle, valeur);
	}

	@Override
	public V rechercher(K cle) { 
		if(estVide()) {
			return null; //return null car comme si nil existait pas
		}
		int cmp = cle.compareTo(racine.cle);
		if(cmp == 0) {
			return  racine.valeur;
		}
		
		if(cmp < 0)
			return racine.fg.rechercher(cle);
		else
			return racine.fd.rechercher(cle);
	}

	@Override
	public boolean contient(K cle) {
		// TODO Auto-generated method stub
		if(estVide()) {
			return false; //return null car comme si nil existait pas
		}
		int cmp = cle.compareTo(racine.cle);
		if(cmp == 0) {
			return  true;
		}
		
		if(cmp < 0)
			return racine.fg.contient(cle);
		else
			return racine.fd.contient(cle);
	}

	@Override
	public V supprimer(K cle) {
		if(estVide())
			return null;
		
		int cmp = cle.compareTo(racine.cle);
		
		if(cmp == 0) {
			V tmp = racine.valeur;
			if(racine.fd.estVide()) {
				racine = racine.fg.racine;
			}
			else if(racine.fg.estVide()) {
				racine = racine.fd.racine;
			}
			else {
				Noeud nd = racine.fd.supprimeLePlusPetit();
				racine.cle = nd.cle;
				racine.valeur = nd.valeur;
			}

			return tmp;
		}
		if(cmp < 0) 
			return racine.fg.supprimer(cle);
		else 
			return racine.fd.supprimer(cle);
		 
	}

	private Noeud supprimeLePlusPetit() {
			if(racine.fg.estVide()) {
				Noeud nd = racine;
				racine = racine.fd.racine; //on remonte le fils droit du fils gauche
				return nd;
			}
			return racine.fg.supprimeLePlusPetit();
		
	}
	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return (racine==null);
	}

	@Override
	public int nbElem() {
		if(estVide())
			return 0;
		
		// TODO Auto-generated method stub
		return racine.fd.nbElem() + racine.fg.nbElem()+1;
	}

	@Override
	public List<K> listDesCles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean necessiteReorg() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reorganiser() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * affichage préfixe
	 */
	
	public String toString() { 
		if (estVide())
			return null;
		return notationExplorateur("");
		
	}
	
	private String notationExplorateur(String indentation) {
		if(estVide()) 
			return  indentation + "VIDE\n";
		String str = indentation + racine.cle + " = " + racine.valeur + "\n";
		if(!racine.fg.estVide() || !racine.fd.estVide()) { 
			str += racine.fg.notationExplorateur(indentation + "	");
			str += racine.fd.notationExplorateur(indentation + "	");
		}
		return str;
	}


	private int hauteur() {
		if(estVide())
			return 0;
		return 1+Math.max(racine.fg.hauteur(), racine.fd.hauteur());
	}
}

/**
 * Un ABR est soit vide (racine == null)
 * soit composé d'une racine 
 * avec 1 cle 1 valeur 
 * 1 fg 
 * 1 fd
 * Les deux sont eux mêmes des ABR
 */
