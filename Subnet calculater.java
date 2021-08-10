import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        arraypharse ap = new arraypharse();
        String ip = sc.nextLine();
        String repip = ip.replace(".", ",");
        int subnet = sc.nextInt();
        String[] stip = repip.split(",");
        int[] reip = ap.stoi(stip);
        int su = subnet%8;
        int quo = subnet/8;
        int[] two = new int[8];
        for(int i = 0;i<two.length;i++)
            two[i] = 2;
        int soip = reip[quo];
        if(soip-128>=0&&su>0){
            soip = soip-128;
            two[7] = 1;
        }else if(soip-128<0&&su>0)
            two[7] = 0;
        su--;
        if(soip-64>=0&&su>0){
            soip = soip-64;
            two[6] = 1;
        }else if(soip-64<0&&su>0)
            two[6] = 0;
        su--;
        if(soip-32>=0&&su>0){
            soip = soip-32;
            two[5] = 1;
        }else if(soip-32<0&&su>0)
            two[5] = 0;
        su--;
        if(soip-16>=0&&su>0){
            soip = soip-16;
            two[4] = 1;
        }else if(soip-16<0&&su>0)
            two[4] = 0;
        su--;
        if(soip-8>=0&&su>0){
            soip = soip-8;
            two[3] = 1;
        }else if(soip-8<0&&su>0)
            two[3] = 0;
        su--;
        if(soip-4>=0&&su>0){
            soip = soip-4;
            two[2] = 1;
        }else if(soip-4<0&&su>0)
            two[2] = 0;
        su--;
        if(soip-2>=0&&su>0){
            soip = soip - 2;
            two[1] = 1;
        }else if(soip-2<0&&su>0)
            two[1] = 0;
        su--;
        if(soip-1>=0&&su>0){
            soip = soip-1;
            two[0] = 1;
        }else if(soip-1<0&&su>0)
            two[0] = 0;
        su--;
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
