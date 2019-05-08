package revision;

public class ChiffreRomain2 {

	static int evalChiffreRomain(char c) {
		
		switch (c) {
		case 'i':
		case 'I':
			return 1;

		case 'v':
		case 'V':
			return 5;

		case 'x':
		case 'X':
			return 10;

		case 'l':
		case 'L':
			return 50;

		case 'c':
		case 'C':
			return 100;

		case 'd':
		case 'D':
			return 500;

		case 'm':
		case 'M':
			return 1000;

		default:
			break;
		}
		
		return 0;
	}

	
	public static int evalNombreRomain(String chiffre) {
		int c1 = evalChiffreRomain(chiffre.charAt(0));
		if(chiffre.length() == 1)
			return c1;
		
		int c2 = evalChiffreRomain(chiffre.charAt(1));
		int reste = evalNombreRomain(chiffre.substring(1));
		
		if(c1 < c2)
			return reste - c1;
		else
			return reste + c1;
		
		
				
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(evalNombreRomain("vIi"));
		
		
	}

}
