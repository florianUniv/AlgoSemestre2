package cours2;

public class PileTabDynamique<E> extends PileTabStatique<E> {
	
	

	

    public PileTabDynamique(int taille) {
		super(taille);
		// TODO Auto-generated constructor stub
	}
    
    
	@SuppressWarnings("unchecked")
	@Override
    public boolean empiler(E elem) {
        if (sp >= t.length){
            E[] aux = (E[])new Object[t.length * 2];
                for (int i = 0; i < t.length; i++) {
                        aux[i] = t[i];
                }
                t = aux;
        }
        return super.empiler(elem);
    }
	//modifier uniquement la fonction empiler

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pile<String> p = new PileTabDynamique<>(1);
		p.empiler("a");
		p.empiler("b");
		p.empiler("c");
		
		
		for(String e : p) {
			System.out.println("e : "+e);
		}
		
		
		}

}


