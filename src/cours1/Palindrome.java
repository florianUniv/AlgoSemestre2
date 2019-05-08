package cours1;

public class Palindrome {

	public static boolean estPalindrome(String mot) {
		
		if(mot.length() <= 1) 
			return true;

		if(mot.charAt(0) != mot.charAt(mot.length()-1))
			return false;
		
		
		return estPalindrome(mot.substring(1,mot.length()-1));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mot = "laval";
		
		if(estPalindrome(mot)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("n'en est pas un ");
	}
}
