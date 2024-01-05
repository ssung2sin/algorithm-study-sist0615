import java.util.Scanner;

public class A3009 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int [] xArray=new int[3];
        int [] yArray=new int[3];

        xArray[0]=sc.nextInt();
        yArray[0]=sc.nextInt();
        xArray[1]=sc.nextInt();
        yArray[1]=sc.nextInt();
        xArray[2]=sc.nextInt();
        yArray[2]=sc.nextInt();

        int x;
        int y;
        
        if (xArray[0]==xArray[1]){
            x=xArray[2];
        } else if (xArray[1]==xArray[2]) {
            x=xArray[0];
        } else {
            x=xArray[1];
        }

        if (yArray[0]==yArray[1]){
            y=yArray[2];
        } else if (yArray[1]==yArray[2]) {
            y=yArray[0];
        } else {
            y=yArray[1];
        }

        System.out.println(x+" "+y);

    }
}
