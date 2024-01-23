package Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//방법2.
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int a=0; a<arr.length-1; a++) {
			for(int b=a+1; b<arr.length; b++) {
				if(arr[a]>arr[b]) {
					int tmp=arr[a];
					arr[a]=arr[b];
					arr[b]=tmp;					
				}
				
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		
		
		//방법1.
		/*ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int j=0; j<list.size(); j++) {
			System.out.println(list.get(j));
		}*/

	}

}
