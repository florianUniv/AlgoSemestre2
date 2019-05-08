package cours1;

public class Hanoï{

	public static void hanoi(int n, int dep, int arr) {
		if(n == 0)
			return;
		int trv = 6-dep-arr;
		//deplace le grand sur le 2
		hanoi(n-1, dep, trv);
		//deplace le grand sur le 3
		System.out.println(dep+" --> "+ arr);
		hanoi(n-1,trv,arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(3,1,3);
	}

}
