import java.util.Arrays;
import java.util.Scanner;

public class A2750 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr= new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        for (int i=1;i<n;i++){

            if (arr[i-1]==arr[i]){
                continue;
            } else {
                System.out.println(arr[i]);
            }
        }

    }
}
