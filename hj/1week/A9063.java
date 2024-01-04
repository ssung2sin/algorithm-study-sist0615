import java.util.Arrays;
import java.util.Scanner;

public class A9063 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n,x,y;
        n=sc.nextInt();
        int [] xarr=new int[n];
        int [] yarr=new int[n];

        for (int i=0;i<n;i++){
            x=sc.nextInt();
            xarr[i]=x;
            y=sc.nextInt();
            yarr[i]=y;
        }
        Arrays.sort(xarr);
        Arrays.sort(yarr);

        x=xarr[0]-xarr[n-1];
        y=yarr[0]-yarr[n-1];

        System.out.println(x*y);

    }
}
