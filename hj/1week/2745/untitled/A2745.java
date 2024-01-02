import java.util.Scanner;

public class A2745 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.next(); // 주어질 문자
        int n=sc.nextInt(); // 주어질 진법 수
        String[] arr=str.split(""); // 입력된 문자를 담아둘 배열

        String [] Alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V","W","X","Y","Z"};
        String [] AlphabetNumber={"10","11","12","13","14","15","16","17","18","19","20","21","22",
                "23","24","25","26","27","28","29","30","31","32","33","34","35"};
        int count=0;

        // 배열에 담아둔 알파벳을 숫자로 변환하기
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<Alphabet.length;j++){
                if (arr[i].equals(Alphabet[j])){
                    arr[i]=AlphabetNumber[j];
                }
            }
        }

        // 배열 계산하기
        for (int i=0;i<arr.length;i++){
            int hoi=(int) Math.pow(n,(arr.length-(i+1)));
            count+=Integer.parseInt(arr[i])*hoi;
        }
        System.out.println(count);









    }
}
