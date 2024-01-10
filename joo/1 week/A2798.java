package baekjoon.week1;

import java.util.Scanner;

public class A2798 {

    public static void main(String[] args) {
        // 블랙잭 문제
        // 배열에서 서로 다른 3개의 요소를 선택해서 M보다 작거나 같은 경우 중 최대값을 찾는 문제
        //주어진 배열에서 세 개의 숫자를 선택하여 만들어진 array_sum이 M 이하일 때, 그 중에서 최대값을 찾는 부분
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] array = new int[N];

        // 배열에 값 각각 받기
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // 배열에서 3개의 합 구하기 위해 선언하기.
        int array_sum = 0;

        // 부른 값(M)의 근사치 중 가장 큰 값 구하기 위해 선언하기
        int maxSum_M = 0;

        // i, j, k는 카드를 의미, 서로 다른 3장의 카드 선택
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    // i, j, k가 서로 다른 경우에만 합을 계산
                    array_sum = array[i] + array[j] + array[k]; //여기서 array_sum이 계속 업데이트 됨.

                    // M에 가까운 값 중 가장 큰 값 구하기
                    if (array_sum <= M && array_sum > maxSum_M) {
                        maxSum_M = array_sum; //위 조건일 때만 maxSum_M을 업데이트가 됨.
                    }
                }
            }
        }

        // 최대값 출력
        System.out.println(maxSum_M);
    }
}
