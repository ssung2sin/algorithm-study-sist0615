package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2798 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken()); //몇장 뽑을건지
    int M=Integer.parseInt(st.nextToken()); //세수의합이 M이하여함
    int[] arr=new int[N];

    int total=0;

    st=new StringTokenizer(br.readLine());
    //입력할배열
    for(int i=0; i<N; i++) {

      arr[i]=Integer.parseInt(st.nextToken());
    }

    //첫번째카드
    for(int k=0; k<N-2; k++) {
      //두번째카드
      for(int l=k+1; l<N-1; l++) {
        //세번째카드
        for(int m=l+1; m<N; m++) {

          //세카드의 합이 M보다 작거나 같을때?
          if(total<(arr[k]+arr[l]+arr[m]) && (arr[k]+arr[l]+arr[m])<=M) {
            total=(arr[k]+arr[l]+arr[m]);
          }
        }
      }

    }

    System.out.println(total);

  }

}

