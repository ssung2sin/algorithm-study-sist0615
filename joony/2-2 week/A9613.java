package Week2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//최대공약수, GCD합
public class A9613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> testArr = new ArrayList<>();
		
		for(int i=0; i<testNum; i++) {
			
			int count = sc.nextInt();
			
			ArrayList<Integer> test = new ArrayList<>();
			
			for(int j=0; j<count; j++) {				
				test.add(sc.nextInt());
			}
			
			//Collections.sort(test);
			testArr.add(test);
		}
		
		//System.out.println(testArr);
		
		for(ArrayList<Integer> test: testArr) {
			System.out.println(getGCD(test));
		}

	}
	
	//각 테스트의 최대공약수를 구하는 메서드
	public static int getGCD(ArrayList<Integer> test) {
		
		ArrayList<ArrayList<Integer>> divisorArr = new ArrayList<>();
		ArrayList<Integer> commonDivisor = new ArrayList<>();
		
		int totalGCD=0;
		
		//각각의 수의 약수들을 배열로 만들어 삽입
		//ex)[[1, 2, 5, 10], [1, 2, 4, 5, 10, 20], [1, 2, 3, 5, 6, 10, 15, 30], [1, 2, 4, 5, 8, 10, 20, 40]]
		for(int i=0; i<test.size(); i++) {
			int num = test.get(i);
			
			ArrayList<Integer> divisor = new ArrayList<>();
			
			for(int j=1; j<=num; j++) {
				if(num%j==0) {
					divisor.add(j);
				}
			}
			
			divisorArr.add(divisor);
			
		}
		
		
		//두개의 배열을 가져와 최대공약수를 구하고 누적해서 합해줌
		for(int i=0; i<divisorArr.size()-1; i++) {
			for(int j=i+1; j<divisorArr.size(); j++) {

				ArrayList<Integer> div1;
				ArrayList<Integer> div2;
				
				if(divisorArr.get(i).size()<divisorArr.get(j).size()) {
					div1 = divisorArr.get(i);
					div2 = divisorArr.get(j);
				}else {
					div1 = divisorArr.get(j);
					div2 = divisorArr.get(i);
				}
				
				//System.out.println(div1+","+div2);
				
				for(int divisor: div1) {
					if(div2.contains(divisor)) {
						commonDivisor.add(divisor);
					}
				}
				
				//System.out.println(commonDivisor.get(commonDivisor.size()-1));
				totalGCD+=commonDivisor.get(commonDivisor.size()-1);
								
			}
		}
		
				
		return totalGCD;
	}

}
