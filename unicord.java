import java.util.*;

class unicord {
    public static void main(String[] args) {
		int a = 3;
		while(a==3) {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("문자를 입력해 주세요>");
			String input = scanner.nextLine();
			System.out.printf("유니코드: ");
			int c = input.length();
			int la = 0;
			while(c>0) {
				char ch = input.charAt(la);
				System.out.printf("&#%d;", (int)ch);
				c--;
				la++;
			}
			System.out.printf("%n");
		}
	}
}
		