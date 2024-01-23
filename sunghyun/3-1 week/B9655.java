package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9655 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Stone=Integer.parseInt(br.readLine());
		
		/*
		 * Stone=1 -> SK win
		 * Stone=2 -> SK 1 -> CY 1 CY win
		 * Stone=3 -> SK = 3 SK win / SK=1 -> CY=1 -> SK=1+1 SK win
		 * Stone=4 -> SK 1 or 3 -> CY 3 or 1 CY win
		 * Stone=5 -> SK 1 or 3 -> CY 3 or 1 -> SK 1 SK win
		 */
		
		bw.write(Stone%2==0?"CY":"SK");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
