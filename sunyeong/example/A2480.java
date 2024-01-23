package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1. 백준에 정답 확인할 때는 클래스명은 Main으로 변경
//2. 패키지 제거 후 전체 복붙하여 확인

public class A2480 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bufferreader는 String형태이기 때문에 다른 형태로 사용하려면 형변환 해줘야 함 꼭!
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		String [] str;
		int [] ju=new int[3];
		
			try {
				str = bf.readLine().split(" ");
				
				for(int i=0;i<3;i++) {
					ju[i]=Integer.parseInt(str[i]);
				}
				
				//3개의 값이 모두 같다면,
				if(ju[0]==ju[1]&&ju[1]==ju[2]) {
					
					int alltotal=10000+ju[0]*1000;
					System.out.println(alltotal);
					
				}else if(ju[0]==ju[1]||ju[0]==ju[2]||ju[1]==ju[2]) { //2개의 값이 같다면,
	
					if(ju[0]==ju[1]||ju[0]==ju[2]) {
						
						int twosametotal1=1000+ju[0]*100;
						System.out.println(twosametotal1);
						
					}else {
						
						int twosametotal2=1000+ju[1]*100;
						System.out.println(twosametotal2);
						
					}
				}else {
					//Math.max는 가장 큰 값을 비교하기 위한 메서드 / 두개씩 비교한다.
					int max=Math.max(ju[0],Math.max(ju[1], ju[2]));
					int othertotal=max*100;
					System.out.println(othertotal);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
	
		
}
}
