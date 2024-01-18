package Week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//다이나믹 프로그래밍, 1,2,3더하기
public class A9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		
		int[] testArr = new int[testNum];
		
		for(int i=0; i<testArr.length; i++) {
			testArr[i]=sc.nextInt();
		}
		
		int num = testArr[0];
		
		ArrayList<ArrayList<Integer>> numArr = new ArrayList<>();
		ArrayList<Integer> oneTwoThree = new ArrayList<>();
		
		//////////////////////////////3으로 나눴을 때 1+2로 변경
		
		int one=0;
		int two=0;
		int three=0;
		
		three=num/3;
		
		if(num%3==2) {
			two=1;
		}else if(num%3==1) {
			one=1;
		}
		
		oneTwoThree.add(one);
		oneTwoThree.add(two);
		oneTwoThree.add(three);
		
		numArr.add(oneTwoThree);
		
		System.out.println(numArr);
		
		while(three!=0||two!=0) {
			ArrayList<Integer> lastArr = new ArrayList<>();
			oneTwoThree = numArr.get(numArr.size()-1);			
			//System.out.println(oneTwoThree);
			
			three = oneTwoThree.get(2);
			two = oneTwoThree.get(1);
			one = oneTwoThree.get(0);
			
			System.out.println(one+","+two+","+three);
			
			if(three!=0) {
				three=three-1;
				two=two+1;
				one=one+1;
				System.out.println(one+","+two+","+three);
			}else if(two!=0){
				two=two-1;
				one=one+2;
			}
			
			lastArr.add(one);
			lastArr.add(two);
			lastArr.add(three);
			
			numArr.add(lastArr);
			
			System.out.println(numArr);
			
		}
		
		//////////////////////////////3으로 나눴을 때 1+1+1로 변경, 수정되야됨
				
		one=0;
		two=0;
		
		three=num/3;
		
		if(num%3==2) {
		two=1;
		}else if(num%3==1) {
		one=1;
		}
		
		oneTwoThree.add(one);
		oneTwoThree.add(two);
		oneTwoThree.add(three);
		
		numArr.add(oneTwoThree);
		
		System.out.println(numArr);
		
		while(three!=0) {
		ArrayList<Integer> lastArr = new ArrayList<>();
		oneTwoThree = numArr.get(numArr.size()-1);			
		//System.out.println(oneTwoThree);
		
		three = oneTwoThree.get(2);
		two = oneTwoThree.get(1);
		one = oneTwoThree.get(0);
		
		System.out.println(one+","+two+","+three);
		
		if(three!=0) {
		three=three-1;
		one=one+3;
		System.out.println(one+","+two+","+three);
		}
		
		lastArr.add(one);
		lastArr.add(two);
		lastArr.add(three);
		
		numArr.add(lastArr);
		
		System.out.println(numArr);
		
		}
		
		/////////////////////////2로 나눴을 때 1+1로 변경
		ArrayList<Integer> oneTwoThree2 = new ArrayList<>();
		
		two=num/2;
		one=0;
		
		if(num%2==1) {
			one=1;
		}
		
		oneTwoThree2.add(one);
		oneTwoThree2.add(two);
		oneTwoThree2.add(three);
		
		numArr.add(oneTwoThree2);
		
		
		System.out.println(numArr);
		
		while(two!=0) {
			ArrayList<Integer> lastArr = new ArrayList<>();
			oneTwoThree2 = numArr.get(numArr.size()-1);			
			//System.out.println(oneTwoThree);
			
			two = oneTwoThree2.get(1);
			one = oneTwoThree2.get(0);
			
			System.out.println(one+","+two+","+three);
			
			two=two-1;
			one=one+2;
			
			lastArr.add(one);
			lastArr.add(two);
			lastArr.add(three);
			
			System.out.println(lastArr);
			
			numArr.add(lastArr);
			
			System.out.println(numArr);
			
		}
		
		HashSet<ArrayList<Integer>> set = new HashSet<>();
		
		for(ArrayList<Integer> arr:numArr) {
			set.add(arr);
		}
		
				
		
		System.out.println(numArr);
		System.out.println(set);

	}

}
