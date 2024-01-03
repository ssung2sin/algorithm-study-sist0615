import java.util.Scanner;

public class A2798 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(); // 카드의 장수
        int m=sc.nextInt(); // 기준 숫자

        int [] cardArray=new int[n];

        for (int i=0;i<n;i++){
            cardArray[i]=sc.nextInt();
        }

        int result=0;

        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    if (cardArray[i]+cardArray[j]+cardArray[k]>m){
                        continue;
                    } else if (cardArray[i]+cardArray[j]+cardArray[k]<=m) {
                        if (result<cardArray[i]+cardArray[j]+cardArray[k]){
                            result=cardArray[i]+cardArray[j]+cardArray[k];
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println(result);

    }
}
