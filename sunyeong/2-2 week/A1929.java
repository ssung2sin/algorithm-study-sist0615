package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sosu_1929 {

	//정수론 - 소수구하기
	//소수는 일반적으로 '에라토스테네스의 체'를 이용해 작성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int start_n=Integer.parseInt(st.nextToken());
			int end_n=Integer.parseInt(st.nextToken());
			
			int [] sosu_arr=new int[end_n+1];
			
			 for(int i=0;i<sosu_arr.length;i++) {
				 
				sosu_arr[i]=i;
				 
			 }
			 //System.out.println(Arrays.toString(sosu_arr)); 0~16까지 출력되는지 확인
			 
			 //Math.sqrt(N)은 N의 제곱근 16의 제곱근=4
 			 for(int i=2; i<=Math.sqrt(end_n);i++) {
 				 if(sosu_arr[i]==0) {
 					 continue;
 				 }
 				 for(int j=2*i;j<=end_n;j=j+i) {
 					 sosu_arr[j]=0; //배수들은 0으로 변경 
 				 }
				 
			 }
 			 for(int i=start_n;i<=end_n;i++) {
 				 if(sosu_arr[i]!=0) {
 					 System.out.println(sosu_arr[i]);
 				 }
 			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
