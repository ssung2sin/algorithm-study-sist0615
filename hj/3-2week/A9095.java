import java.io.*;
import java.util.StringTokenizer;

public class A9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase=Integer.parseInt(br.readLine());

        for (int i=0;i<testCase;i++){
            int result=1; // 전체가 1인 경우 한개
            StringTokenizer st=new StringTokenizer(br.readLine());
            int number=Integer.parseInt(st.nextToken());

            if (number==1){
                bw.write(1+"\n");
            } else if (number==2) {
                bw.write(2+"\n");
            } else if (number==3) {
                bw.write(4+"\n");
            } else {
                if (number%2==0){
                    result++;
                } else if (number%3==0) {
                    result++;
                }
                result+=number-1;
                result+=number-2;
                bw.write(result+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }


    // 50분 실패
}
