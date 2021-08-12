import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arraypharse ap = new arraypharse();
        String ip = sc.nextLine();
        String repip = ip.replace(".", ",");
        int subnet = sc.nextInt();
        String[] stip = repip.split(",");
        int[] reip = ap.stoi(stip);
        int su = subnet % 8;
        int quo = subnet / 8;
        int[] two = new int[8];
        for (int i = 0; i < two.length; i++)
            two[i] = 2;
        int soip = reip[quo];
        for (int i = 7; i >= 0; i--) {
            int ze = (int)Math.pow(2, i);
            if (soip - ze >= 0 && su > 0){
                soip = soip - ze;
                two[i] = 1;
            }else if (soip - ze < 0 && su > 0)
                two[i] = 0;
            su--;
        }
        int netres = 0;
        int broadres = 0;
        int[] copy = new int[8];
        for(int i = 0;i<two.length;i++){
            copy[i] = two[i];
        }
        for(int i = 0;i<8;i++){
            double db= (double)i;
            int res = 0;
            if(two[i] == 2) {
                two[i] = 0;
            }
            if(two[i]==1)
                res = (int)(Math.pow(2,db));
            netres = netres+res;
        }
        for(int i = 0;i<8;i++){
            double db = (double)i;
            int res = 0;
            if(copy[i] == 2) {
                copy[i] = 1;
            }
            if(copy[i] == 1)
                res = (int)(Math.pow(2,(double)i));
            broadres = broadres + res;
        }
        for(int i = 0;i<quo;i++)
            System.out.printf(stip[i] + ".");
        System.out.printf("%d", netres);
        for(int i = 4-quo;1<i;i--)
            System.out.printf("." + "%d",0);
        System.out.println();
        for(int i = 0;i<quo;i++)
            System.out.printf(stip[i] + ".");
        System.out.printf("%d", broadres);
        for(int i = 4-quo;1<i;i--)
            System.out.printf("." + "%d", 255);
        System.out.println();
        if(4-quo<=1){
            for(int i = 0;i<quo;i++)
                System.out.printf(stip[i] + ".");
            System.out.printf("%d" + " ~ ", netres + 1);
            for(int i = 0;i<quo;i++)
                System.out.printf(stip[i] + ".");
            System.out.printf("%d", broadres -1);
        }else{
            for(int i = 0;i<quo;i++)
                System.out.printf(stip[i] + ".");
            System.out.printf("%d" , netres);
            for(int i = 4-quo;2<i;i--)
                System.out.printf("." + "%d",0);
            System.out.printf("." + "%d" + " ~ ", 1);
            for(int i = 0;i<quo;i++)
                System.out.printf(stip[i] + ".");
            System.out.printf("%d", broadres);
            for(int i = 4-quo;2<i;i--)
                System.out.printf("." + "%d", 255);
            System.out.printf("." + "%d", 254);
        }
    }
}
class arraypharse{
    int[] stoi(String[] a){
        int[] result = new int[a.length];
        for(int i = 0;i<a.length;i++){
            result[i] = Integer.parseInt(a[i]);
        }
        return(result);
    }
}
