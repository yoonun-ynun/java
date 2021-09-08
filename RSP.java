import java.util.Random;
import java.util.Scanner;

public class RSP {
    static Exception e = new Exception("wrong number Exception");
    public static void main(String[] args){
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int a = ra.nextInt(3);
        System.out.println("0 - 가위 1 - 바위 2 - 보");
        System.out.printf("숫자를 입력해 주세요: ");
        int b = sc.nextInt();
        if(b>2 || b<0) {
            try {
                throw e;
            } catch (Exception e) {
                System.out.println("숫자를 다시 입력해주세요");
                e.printStackTrace();
                System.exit(0);
            }
        }
        String pc = its(a);
        String user = its(b);
        System.out.println("PC : " + pc);
        System.out.println("플레이어 : " + user);
        if(b == 0){
            if(a == 0)
                System.out.println("무승부");
            if(a == 1)
                System.out.println("패배");
            if(a == 2)
                System.out.println("승리");
        }
        if(b == 1){
            if(a == 1)
                System.out.println("무승부");
            if(a == 0)
                System.out.println("승리");
            if(a == 2)
                System.out.println("패배");
        }
        if(b == 2){
            if(a == 2)
                System.out.println("무승부");
            if(a == 0)
                System.out.println("패배");
            if(a == 1)
                System.out.println("승리");
        }
    }
    static String its(int a){
        String b = "";
        if(a == 0)
            b = "가위";
        else if(a == 1)
            b = "바위";
        else if(a == 2)
            b = "보";
        return b;
    }
}
