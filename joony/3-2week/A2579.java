package Week3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//다이나믹 프로그래밍, 계단 오르기(동적 계획법)
public class A2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int stairNum = sc.nextInt();
		
		int[] stairScore = new int[stairNum+1];
		
		for(int i=1; i<=stairNum; i++) {
			stairScore[i]=sc.nextInt();
		}
		
		
		//n=1 1 =>1
		//n=2 2 11 =>2
		//n=3 21 111(x)/ 12 =>2
		//n=4 211 1111(x) 121/ 22 112 =>4
		//n=5 2111(x) 11111(x) 1211 221 1121/ 212 1112(x) 122 =>5
		//1과2만을 사용하지만 연속으로 111이 속해 있으면 안됨
		//dp(n)=dp(n-1)+dp(n-2)인 경우에서 연속으로 111이 속해 있는 경우를 모두 제외해야됨
		
		ArrayList<String> dynaminStr = dynamic(stairNum);
		ArrayList<ArrayList<Integer>> dynamic = new ArrayList<>();
		
		//System.out.println(dynaminStr);
		
		for(String str: dynaminStr) {
			
			String[] strArr = str.split("");
			
			int sum=0;
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(String str2:strArr) {				
				sum+=Integer.valueOf(str2);
				list.add(sum);
			}
			
			dynamic.add(list);
		}
		
		//System.out.println(dynamic);
		
		ArrayList<Integer> scoreArr = new ArrayList<>();
		
		for(ArrayList<Integer> arr:dynamic) {
			int sum=0;
			for(int i: arr) {
				sum+=stairScore[i];
			}
			
			scoreArr.add(sum);
			
		}
		
		//System.out.println(scoreArr);
		System.out.println(Collections.max(scoreArr));

	}
	
	
	public static ArrayList<String> dynamic(int n){
		
		ArrayList<String> dpArr = new ArrayList<>();
		
		if(n==1) {
			dpArr.add("1");
			return dpArr;
		}else if(n==2) {
			dpArr.add("2");
			dpArr.add("11");
			return dpArr;
		}else {
			
			ArrayList<String> oneArr = dynamic(n-1);
			
			for(int i=0; i<oneArr.size(); i++) {
				String str = oneArr.get(i) + 1;
				oneArr.set(i, str);
			}
			
			ArrayList<String> twoArr = dynamic(n-2);
			
			for(int i=0; i<twoArr.size(); i++) {
				String str = twoArr.get(i) + 2;
				twoArr.set(i, str);
			}
			
			
			for(String str: oneArr) {
				if(!str.contains("111")&&!str.contains("211")) {
					dpArr.add(str);
				}
			}
			
			for(String str: twoArr) {
				if(!str.contains("111")&&!str.contains("211")) {
					dpArr.add(str);
				}
			}
			
			return dpArr;
		}
		
	}

}
