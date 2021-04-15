import java.util.*;
class save {
    int a;
    int b;
    void print(){
        if(a==0) {
            System.out.println(b);
        }else if(b==0) {
            System.out.println(a);
        } else if(a>b){
                System.out.println(b);
            }else if(b>a){
                System.out.println(a);
            }
        }

    }
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        save Save = new save();
        int N = sc.nextInt();
        if((N/3)<1) {
            System.out.println(-1);
            System.exit(0);
        }
        if(N%5!=0) {
            int d = 0;
            for(int i=1;i<(N/5)+1;i++){
                int b = N-(5*i);
                if((b%3)==0){
                    d = (b/3)+i;
                    Save.b = d;
                }
            }
            int a = N%5;
            if ((N % 3) == 0) {
                int c = N/3;
                Save.a = c;
            }
            if((N%3)!=0 && Save.b==0){
                System.out.println(-1);
                System.exit(0);
            }
            Save.print();
        }
        if((N%5)==0){
            System.out.println(N/5);
        }
    }
}
