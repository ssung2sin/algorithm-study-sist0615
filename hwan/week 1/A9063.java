package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9063 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // 옥구슬 갯수

    int xMax = Integer.MIN_VALUE; 
    int xMin = Integer.MAX_VALUE; 

    int yMax = Integer.MIN_VALUE; 
    int yMin = Integer.MAX_VALUE; 

    for (int i = 0; i < N; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken()); // x축
      int y = Integer.parseInt(st.nextToken()); // y축

      if (xMax < x) {
        xMax = x;
      }

      if (xMin > x) {
        xMin = x; 
      }

      if (yMax < y) {
        yMax = y;
      }

      if (yMin > y) {
        yMin = y; 
      }
    }
    //System.out.println(xMax + " " + yMax);
    //System.out.println(xMin + " " + yMin); 
    
    System.out.println((yMax-yMin)*(xMax-xMin));
  }
}
