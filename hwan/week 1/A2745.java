package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2745 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    //숫자or알파벳
    String N = st.nextToken();
    //진수
    int B = Integer.parseInt(st.nextToken());

    //합계
    int sum = 0;
    //진법의 제곱수 ex)2의 0제곱 = 1
    int count = 1;

    // 오른쪽부터셈
    for (int i = N.length() - 1; i >= 0; i--) {
      //입력한 String값을 문자로 전환
      char charN = N.charAt(i);
      //문자로 전환한 값을 다시 숫자로전환
      int intN = 0;
      
      //isDigit 함수는 문자가 숫자인지 확인
      //true
      if (Character.isDigit(charN)) {
        //문자로 전환한 값을 다시 숫자로전환
        intN = charN - '0';
       //false
      } else {
        //문자로 전환한 값을 다시 숫자로전환
        intN = charN - 'A' + 10;
      }
      //합을 먼저 누적을시키고 count를 곱해야함 count먼저 계산하면 초기값이 바뀜
      sum += intN * count;
      count *= B;
    }

    System.out.println(sum);
  }
}
