package cours4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dico<Integer,String> d = new ABR<>();
		d.ajouter(20, "info de 20");
		d.ajouter(10, "info de 10");
		d.ajouter(50, "info de 50");
		//System.out.println(d.rechercher(20));
		d.supprimer(20);
		System.out.println("nb elem : " + d.nbElem());
		System.out.println(d);
		
	}

}
