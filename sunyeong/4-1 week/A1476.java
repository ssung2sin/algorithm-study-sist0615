package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1476 {

	//날짜계산
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		//지구를 나타내는 수 E
		int E=Integer.parseInt(st.nextToken());
		//태양을 나타내는 수 S
		int S=Integer.parseInt(st.nextToken());
		//달을 나타내는 수 M
		int M=Integer.parseInt(st.nextToken());
		
		//년도들은 1부터 시작
		 int year = 1;
	        while (true) {
	            if ((year - E) % 15 == 0 && (year - S) % 28 == 0 && (year - M) % 19 == 0) {
	                System.out.println(year);
	                break;
	            }
	            year++;
	        }
			
	
		
	}

}
