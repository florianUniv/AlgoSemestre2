package cours1;

public class Inversion {
	
	public static String inverser(String mot) {
		if(mot.length()<=1) 
			return mot;

		//inverser une chaine c 'est le mettre à la fin de la chaine qui reste exemple ABCD
		//1 : BCDA
		//2... : DCBA 
		return inverser(mot.substring(1))+mot.charAt(0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(inverser("srevne'l à relrap ntm tuep no"));
	}

}
