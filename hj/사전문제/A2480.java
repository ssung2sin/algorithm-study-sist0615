import java.util.Scanner;

public class A2480 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a==b&&b==c){
            int result=10000+(a*1000);
            System.out.println(result);
        } else if (a==b||a==c) {
            int result=1000+(a*100);
            System.out.println(result);
        } else if (b==c) {
            int result=1000+(b*100);
            System.out.println(result);
        } else {
            int result=Math.max(Math.max(a,b),c);
            System.out.println(result*100);
        }
    }
}
