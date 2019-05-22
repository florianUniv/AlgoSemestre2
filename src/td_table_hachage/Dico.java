/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_table_hachage;

import java.util.List;

/**
 *
 * @author florian
 */
public interface Dico<K,V> {
    
    V ajouter(K cle,V valeur);
    V rechercher(K cle);
    boolean contient(K cle);
    V supprimer(K cle);
    boolean estVide();
    int nbElem();
    List<K> listeDesCles();
    boolean necessiteReorganisation();
    void reorganiser();
   
}
