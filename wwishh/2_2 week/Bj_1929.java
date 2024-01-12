package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bj_1929 {

	//에라토스테네스의 체(소수를 찾는 방법 => 소수인 해당 수를 제외한 배수들을 제거)
	public static boolean[] sieveOfEratosthenes(int end) {
		boolean[] primeNumber = new boolean[end + 1];

		for (int i = 2; i < primeNumber.length; i++) {
			primeNumber[i] = true; // 초기값이 false이므로 true로 바꿔줌
		}

		for (int i = 2; i <= Math.sqrt(end); i++) {
			if (primeNumber[i]) {
				for (int j = i * i; j <= end; j+=i)
					primeNumber[j] = false;
			}
			//소수이면 그 수를 제외한 범위 안 배수들을 false로
		}

		return primeNumber;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int start = Integer.parseInt(input.split(" ")[0]);
		int end = Integer.parseInt(input.split(" ")[1]);

		boolean[] output = sieveOfEratosthenes(end);

		for (int i = start; i < output.length; i++) {
			if (output[i] == true)
				System.out.println(i);

		}
	}

}
