package Day1230;

import java.util.Scanner;

public class A2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count=0;
		
		String list[]={"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<list.length;i++) {
			str = str.replace(list[i], "e");
		}
		
		System.out.println(str.length());

	}

}
