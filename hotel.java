import java.util.*;
class Cal{
	int good;
	int[] res = new int[good];
	void a(){
		for(int t=good;t>0;t--)
			System.out.println(res[good-1]);
	}
}
class Main {
	public static void main(String[] args) {
		Cal cal = new Cal();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int T = Integer.parseInt(input);
		cal.good = T;
		int[] result = new int [T];
		while(T>0){
			int Hei = scanner.nextInt();
			int Wei = scanner.nextInt();
			int Num = scanner.nextInt();
			if(1<=Hei && Wei<=99 && 1<=Num && Num<=Hei*Wei){
				int first = Num/Hei+1;
				int last = Num%Hei*100;
				result[T-1] = first + last;
                System.out.println(result[T-1]);
				cal.res[T-1] = result[T-1];
			}
			T--;
		}
		cal.a();
	}
}