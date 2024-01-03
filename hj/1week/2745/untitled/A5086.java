import java.util.Scanner;

public class A5086 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b;

        while (true){
            a=sc.nextInt();
            b=sc.nextInt();

            if (a==0 && b==0){
                break;
            } else if (a<b && b%a==0) {
                System.out.println("factor");
            } else if (a>b && a%b==0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }
    }
}
