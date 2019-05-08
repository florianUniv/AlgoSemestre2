package revision;

public class Inversion2 {
	
	public static String inverser(String mot) {
		if(mot.length() <= 1)
			return mot;
		
		return inverser(mot.substring(1))+mot.charAt(0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(inverser("chalom"));
		String mot = "abcd";
		System.out.println(mot.substring(1));
		
	}

}
