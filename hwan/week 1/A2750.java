package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A2750 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N=sc.nextInt();
    int[] arr=new int[N];
    
    for(int i=0; i<N; i++) {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    
    for(int j=0; j<N; j++) {
      
      bw.write(arr[j]+"\n");
    }
    
    bw.flush();
    bw.close();
  }

}
