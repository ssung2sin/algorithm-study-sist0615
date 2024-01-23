package algorithm_1Week;

import java.util.Scanner;

public class changeDecimal {
// Q.2745 / 성공
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputNum;
		int baseN;
		int result;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.next();	// 수
		baseN = sc.nextInt();		// 진법
		
		if(baseN >= 2 && baseN <= 36) {
			result = Integer.parseInt(inputNum, baseN);
		}else {
			System.out.println("입력값이 잘못되었습니다.");
			return;
		}
		System.out.println(result);
	}

}
