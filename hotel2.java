import java.util.*;
class Cal{
	int[] res;
	void a(){
		for(int t=res.length;t>0;t--)
			System.out.println(res[t-1]);
	}
}
class Main {
	public static void main(String[] args) {
		Cal cal = new Cal();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int T = Integer.parseInt(input);
		cal.res = new int [T];
		int[] result = new int [T];
		while(T>0){
			int Hei = scanner.nextInt();
			int Wei = scanner.nextInt();
			int Num = scanner.nextInt();
			int o = Num%Hei;
			if(1<=Hei && Wei<=99 && 1<=Num && Num<=Hei*Wei){
				int first = Num/Hei+1;
				int last = Num%Hei*100;
				result[T-1] = first + last;
				cal.res[T-1] = result[T-1];
			}
			T--;
		}
		cal.a();
	}
}