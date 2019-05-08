package revision;

public class Palindrome2 {

	private Palindrome2() {
	    throw new IllegalStateException("Utility class");
	  }
	
	public static boolean estPalindrome(String mot) {
		if(mot.length() == 1)
			return true;
		
		if(mot.charAt(0) != mot.charAt(mot.length()-1))
			return false;
		
		return estPalindrome(mot.substring(1,mot.length()-1));
		
		
	}
}
