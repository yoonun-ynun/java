import java.util.*;
class hotel {
	public static void main(String[] args) {
		int T;
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		T = Integer.parseInt(input);
		int[] result = new int [T];
		num:
		while(T>0){
			int Hei = scanner.nextInt();
			int Wei = scanner.nextInt();
			int Num = scanner.nextInt();
			if(1<=Hei && Wei<=99 && 1<=Num && Num<=Hei*Wei){
				int first = Num/Hei+1;
				int last = Num%Hei*100;
				result[T-1] = first + last;
				System.out.println(result[T-1]);
			}else {
				System.out.println("불가능한 수식입니다..");
				break num;
			}
			T--;
		}
	}
}