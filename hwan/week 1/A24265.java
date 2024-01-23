package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A24265 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long n=Integer.parseInt(br.readLine());

    //long sum=0; 

    /*for(int i=1; i<=n-1; i++) {

      for(int j=i+1; j<=n; j++) {


        sum++;
        //System.out.println("i="+i+ " j="+j+" sum: "+sum);

      }
    }*/
    
    //i가 1일 경우 j는 2부터 7까지 6번(n-1),
    //i가 2일 경우 j는 3부터 7까지 5번(n-2),
    //...,
    //i가 5일 경우 j는 6부터 7까지 2번(n-5),
    System.out.println((n*(n-1))/2);
    
    //System.out.println(sum);
    System.out.println(2);

  }

}
