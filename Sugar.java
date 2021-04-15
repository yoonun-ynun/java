import java.util.Scanner;
public class Main {

public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=0;
		while(n>0) {
			if(n%5==0) {
				n=n-5;
			}
			else if(n%3==0) {
				n=n-3;
			}else
				n= n-5;
			i++;
		}
		if(n<0) {
			i=-1;
		}
		System.out.println(i);
    
}
}