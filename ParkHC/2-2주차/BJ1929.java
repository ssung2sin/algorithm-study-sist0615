package algorithm_2Week_2;

import java.util.Scanner;

public class BJ1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  							// n 이상
        int m = sc.nextInt();  							// m 이하

        boolean[] arr = new boolean[m + 1];
        arr[0] = true;
        arr[1] = true;

        int sqrtM = (int) Math.sqrt(m); 				// 에라토스테네스의 체

        for (int i = 2; i <= sqrtM; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= m; j += i) {
                	arr[j] = true;
                }
            }
        }

        for (int i = Math.max(2, n); i <= m; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
