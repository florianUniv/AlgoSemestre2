package cours1;

public class ChiffreRomain {

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

	static int evalNombreRomain(String s) {
		int c1 = evalChiffreRomain(s.charAt(0));
		if (s.length() == 1)
			return c1;

		int c2 = evalChiffreRomain(s.charAt(1));
		int reste = evalNombreRomain(s.substring(1));

		if (c1 >= c2)
			return reste + c1;
		else
			return reste - c1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evalNombreRomain("XLII"));
	}

}
