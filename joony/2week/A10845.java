package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class A10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> queue = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input; i++) {
			String[] command = sc.nextLine().split(" ");
			
			switch(command[0]) {
			case "push":
				int value = Integer.parseInt(command[1]);
				queue.add(value);
				break;
			
			case "pop":
				if(!queue.isEmpty()) {
					sb.append(queue.get(0)).append("\n");
					queue.remove(queue.get(0));
				}else {
					sb.append("-1").append("\n");
				}
				break;
				
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			
			case "empty":
				sb.append(queue.isEmpty()?1:0).append("\n");
				break;
				
			case "front":
				if(!queue.isEmpty()) {
					sb.append(queue.get(0)).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
				break;
				
			case "back":
				if(!queue.isEmpty()) {
					sb.append(queue.get(queue.size()-1)).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
				break;
				
				
			}
		}
		
		System.out.println(sb.toString());
		
		

	}

}
