package baekjoon.week2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최대공약수, 최소공배수 구하는 문제 
		// 입력 24 18
		// 현재 풀이법 : 각 입력받은 숫자의 약수를 배열에 담고, 공약수는 다른 배열에 담아 최대공약수 구함
		// 나중에 풀어보고 싶은 (알아보고 싶은) 풀이법 : 유클리드호제법

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	
		int y = sc.nextInt();
		
		//<>으로 할 땐 size로 뽑고, []로 할 땐 length로 뽑는다.
		ArrayList<Integer> xarr = new ArrayList<Integer>(); 
		ArrayList<Integer> yarr = new ArrayList<Integer>();
		ArrayList<Integer> xyarr = new ArrayList<Integer>(); //x와 y의 공약수들의 집합
		
		//x의 약수들을 넣은 배열
		for(int n=1; n<=x; n++) {
			
			if(x%n==0) {
				xarr.add(n);
			}
		}
		
		//y의 약수들을 넣은 배열
		for(int n=1; n<=y; n++) {
			
			if(y%n==0) {
				yarr.add(n);
			}
			
		}
		
		//x와 y의 공통된 약수들만 넣은 배열 = 공약수 배열
		if(xarr.size() > yarr.size() || xarr.size() == yarr.size()) {
			for(int i=xarr.size()-1;i>=0;i--) {
				//yarr.get(i)는 값을 가져옴
				//contains는 yarr가 xarr.get(i)값을 가져오는지 boolean값으로 return
				if(yarr.contains(xarr.get(i))) {
					xyarr.add(xarr.get(i));
				}
			}
		} else { //xarr.size() < yarr.size()
			for(int i=yarr.size()-1;i>=0;i--) {
				if(xarr.contains(yarr.get(i))) {
					xyarr.add(yarr.get(i));
				}
			}
		}
		
		int xyMax = xyarr.get(0); //최대공약수
		int xM = x/xyMax; //x를 최대공약수로 나눈 몫
		int yM = y/xyMax; //y를 최대공약수로 나눈 몫
			
		int xyMin = xyMax * xM * yM ; //최소공배수
		
		//System.out.println(xarr);
		//System.out.println(yarr);
		//System.out.println(xyarr);
		System.out.println(xyMax);//최대공약수
		System.out.println(xyMin);//최소공배수
		}
			
	}




