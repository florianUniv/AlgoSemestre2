package cours1;

public class ConversionBinaire {

	public static void conversionBinaire(int nombre) {
		
		if(nombre == 0) 
			return;
		
		conversionBinaire(nombre/2);
		
		System.out.print(nombre%2);
		
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conversionBinaire(13);
	}

}
