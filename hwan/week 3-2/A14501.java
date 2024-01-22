package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int days = Integer.parseInt(reader.readLine()); //주어진기간
		//int[] currentDay=new int[days+1]; //현재날

		int[] times = new int[days+1]; //각 날짜에 대한 상담소요기간
		int[] pays = new int[days+1]; //각 날짜에 대한 상담수익

		for (int i = 1; i <= days; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			times[i] = Integer.parseInt(st.nextToken());
			pays[i] = Integer.parseInt(st.nextToken());
		}

		// maxPays: 각 날짜까지의 최대 수익을 저장하는 배열
		int[] maxPays = new int[days + 1];

		for (int currentDay = 1; currentDay <= days; currentDay++) {
			//(현재날짜에 해당날짜의 상담소요기간을 더한값이)이 주어진기간이하일때
			if (currentDay + times[currentDay] <= days) {
			//최대급여[현재날짜에 해당날짜의 상담소요기간을 더한값], 최대급여[현재날짜]+급여[현재날짜] 비교
				maxPays[currentDay + times[currentDay]] = Math.max(maxPays[currentDay + times[currentDay]], maxPays[currentDay] + pays[currentDay]);
			}
			// 해당 날짜에 일할 수 없다면, 이전까지 일한 최대 수당을 넣어주어야 한다.
			
			//현재 날짜+1=다음날, 다음날이 주어진기간이하일때
			if (currentDay + 1 <= days) { //다음날이 주어진기간이하일경우
				//최대급여[다음날]=최대급여[다음날],최대급여[현재날짜] 비교
				maxPays[currentDay + 1] = Math.max(maxPays[currentDay + 1], maxPays[currentDay]);
			}
		}

		System.out.println(maxPays[days]);



	}//main
}