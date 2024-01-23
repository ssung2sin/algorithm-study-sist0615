package Week2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//소수 구하기, 에라토스테네스의 체
public class A1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//m이상 n이하의 소수를 모두 출력
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//에라토스테네스의 체: 주어진 범위의 수를 모두 배열에 넣고, 
		//가장 작은 소수부터 그 소수의 배수들을 모두 지움
		//ex)
		//2는 소수이므로 2의 배수인 4, 6, 8, ..., 30을 모두 지운다.
		//다음으로 남은 수 중 가장 작은 소수인 3의 배수인 9, 12, 15, ..., 30을 모두 지운다.
		//다음으로 남은 수 중 가장 작은 소수인 5의 배수인 25를 모두 지운다.
		//위의 과정을 반복하면 2, 3, 5, 7, 11, 13, 17, 19, 23, 29가 남게 되어 이 수들이 소수이다.	
		
		ArrayList<Integer> nPrime = isPrime(n);//큰 수
		
		//System.out.println(nPrime);
		//System.out.println(mPrime);
		

		for(int prime: nPrime) {
			if(prime>=m && prime<=n) {
				System.out.println(prime);
			}
		}
		

	}
	
	//1~n까지의 수 중 소수인 수들을 구하는 메서드
	//소수:1과 자기 자신 이외의 어떤 자연수로도 나누어지지 않는 자연수
	//소수 판별법
	//ex)
	//16이 소수인가?=>16의 약수는 {1,2,4,8,16}으로 가운데인 4이후부턴 대칭이므로 16의 제곱근까지만 탐색해 주면 됨
	public static ArrayList<Integer> isPrime(int n) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		//1~n까지의 모든 수를 primeArr배열에 삽입
		ArrayList<Integer> primeArr = new ArrayList<>();
		for(int i=0 ;i<=n; i++) {
			primeArr.add(i);
		}
		
		//소수가 아닌 값은 0으로 변경
		//1은 소수가 아니므로 제일 작은 소수인 2부터 탐색을 시작
		primeArr.set(1, 0);//1번인덱스 자리의 값을 0으로 변경, 즉 1을 0으로 변경하고 2부터 탐색시작
		
		for(int i=2; i*i<=n; i++) {
			//가져온 값이 소수라면
			if(primeArr.get(i)!=0) {
				//ex)i=2라면 2는 소수이므로 변경하지 않고 제곱인4를 시작으로 2의 배수를 모두 0으로 변경
				//제곱부터 시작하는 이유는 어떤수의 약수를 구할때 그 수의 제곱근을 기준으로 오른쪽,왼쪽이 대칭되기 때문
				//25의 약수는 {1,5,25}으로 가운데인 5이후부턴 대칭이므로 25의 제곱근까지만 탐색해 주면 됨, 거꾸로 생각하면 5의 제곱부터 제거하면 그전의 수는 이미 다른 소수들에 의해 제거되어있음
				//5*5부터 시작하는 이유는 앞의 5*4,5*3,5*2는 소수2,3으로 인해 이미 제거되어있음
				for(int j=i*i; j<=n; j+=i) {
					primeArr.set(j,  0);
				}
			}
		}
		
		//0을 모두 제거
		for(int prime: primeArr) {
			if(prime!=0) {
				result.add(prime);
			}
		}
		
		
		
		return result;
	}

}
