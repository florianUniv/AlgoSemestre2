/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_table_hachage;

import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author florian
 */
public class HashChainee<V> implements Dico<String, V> {

    private class Noeud{
        String cle;
        V valeur;
        Noeud suiv;

        private Noeud(String c, V valeur, Noeud suiv) {
            this.cle=cle;
            this.valeur=valeur;
            this.suiv=suiv;
        }
        
        
    }
    
    private Noeud [] t;
    private int nbElem;
    
    public HashChainee(){
        this(10);
        //this.t = (Noeud[]) new Object[10];
        //int nbElem=0;
    }
    
    public HashChainee(int taille){
        this.t = (Noeud[]) new Object[taille];
        int nbElem=0;
    }
    
    
    private int hachage(String cle){
        //return cle.hashCode()%this.t.length;
        int h=0;                               //   int h=0
        int p=1; //puissance 31                //   for(int i=0;i<cle.length();i++)
        for(int i=0;i<cle.length();i++){       //ou    h=31*h+cle.charAt(i);
            h=h+cle.charAt(i)*p;               // 
            p=p*31;                            //
        }
        return Math.abs(h) % this.t.length;
    }
    
    @Override
    public V ajouter(String cle, V valeur) {
        int h = hachage(cle);
        Noeud n = t[h];
        while(n!=null){ //clé trouvé, on remplace l'ancienne val par la nouvelle
            if(cle.equals(n.cle)){
                V tmp = n.valeur;
                n.valeur=valeur;
                return tmp;
            }
            n = n.suiv;
        }
        //la clé ne se trouve pas 
        t[h] = new Noeud(cle,valeur,t[h]);
        nbElem++;
        return null;
    }

    @Override
    public V rechercher(String cle) {
        int h = hachage(cle);
        Noeud n = t[h];
        while(n!=null){ 
            if(cle.equals(n.cle)){
                return n.valeur;
            }
            n = n.suiv;
        }
        //la clé ne se trouve pas 
        return null;
    }

    @Override
    public boolean contient(String cle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V supprimer(String cle) {
        int h = hachage(cle);
        Noeud prec = null;
        Noeud n = t[h];
        while(n!=null){ 
            if(cle.equals(n.cle)){
                if(prec==null){
                    t[h]=n.suiv;
                }
                else{
                    prec.suiv=n.suiv;
                }
                nbElem--;
                return n.valeur;
            }
            prec=n;
            n = n.suiv;     
        }
        //la clé ne se trouve pas 
        return null;
    }
    
    /*
    public void toString(){
        
    }
    */
    
    private double tauxCharge(){
        return (double) nbElem/t.length;
    }

    @Override
    public boolean estVide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nbElem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> listeDesCles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean necessiteReorganisation() {
        return tauxCharge()>=0.8;
    }

    @Override
    public void reorganiser() {
        Noeud[] t0=t;
        t=(Noeud[]) Array.newInstance(Noeud.class,t.length*2);
        nbElem=0;
        for(int i=0;i<t0.length;i++){                        //for(Noeud e:t0){ 
            for(Noeud n=t0[i];n!=null;n=n.suiv){             //for(Noeud n=e;n!null;n=n.suiv)
                ajouter(n.cle,n.valeur);                     //this.ajouter(n.cle,n.valeur);
            }
        }
    }
    
}
