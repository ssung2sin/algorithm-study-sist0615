import java.util.*;

public class A2609 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int naturalNumberA=sc.nextInt(); // 주어지는 자연수
        int naturalNumberB=sc.nextInt(); // 주어지는 자연수

        int greatestCommonDivisor=1; // 최대 공약수
        long leastCommonMultiple; // 최소 공배수

        int multipleA=1; // 공배수에 사용 될 수
        int multipleB=1; // 공배수에 사용 될 수

        // 최소 공배수
        while (true){
            if (naturalNumberA*multipleA==naturalNumberB*multipleB){
                leastCommonMultiple=naturalNumberA*multipleA;
                break;
            } else if (naturalNumberA*multipleA<naturalNumberB*multipleB) {
                multipleA++;
            } else if (naturalNumberA*multipleA>naturalNumberB*multipleB) {
                multipleB++;
            }
        }

        // 최대 공약수 구하기
        int commonDivisorA []=new int[naturalNumberA]; // 공약수
        int commonDivisorB []=new int[naturalNumberB]; // 공약수

        int arrayAddress=0; // 배열에 사용될 번지수

        // commonDivisorA 배열에 소수 집어넣기
        for (int i=2;i<=naturalNumberA;i++){
            if (naturalNumberA==1){
                break;
            }
            while (naturalNumberA%i==0){
                commonDivisorA[arrayAddress]=i; // 나누기에 성공한 i 배열에 넣기
                arrayAddress++; // 배열 번지수 +1
                naturalNumberA/=i; // i로 나누어진 변수 집어 넣기
            }
        }

        arrayAddress=0; // 배열에 사용될 번지수 초기화

        // commonDivisorB 배열에 소수 집어넣기
        for (int i=2;i<=naturalNumberB;i++){
            if (naturalNumberB==1){
                break;
            }
            while (naturalNumberB%i==0){
                commonDivisorB[arrayAddress]=i; // 나누기에 성공한 i 배열에 넣기
                arrayAddress++; // 배열 번지수 +1
                naturalNumberB/=i; // i로 나누어진 변수 집어 넣기
            }
        }

        int primeFactorsA []=new int[commonDivisorA.length];
        int primeFactorsB []=new int[commonDivisorB.length];
        int primeFactorsCountA []=new int[primeFactorsA.length];
        int primeFactorsCountB []=new int[primeFactorsB.length];

        // 값 비교
        int k=1; // for 문에서 j가 초기화 되는 것을 방지하기 위해 사용 함.

        for (int i=1;i<commonDivisorA.length;i++){
            int numberCount=1;
            for (int j=k;j<commonDivisorA.length;j++){
                if (commonDivisorA[j-1]==0){
                    break;
                } else if (commonDivisorA[j-1]==commonDivisorA[j]){
                    numberCount++;
                    k++;
                } else {
                    primeFactorsA[i-1]=commonDivisorA[j-1];
                    primeFactorsCountA[i-1]=numberCount;
                    k++;
                    break;
                }
            }
        }

        k=1; // j 초기화

        for (int i=1;i<commonDivisorB.length;i++){
            int numberCount=1;
            for (int j=k;j<commonDivisorB.length;j++){
                if (commonDivisorB[j-1]==0) {
                    break;
                } else if (commonDivisorB[j-1]==commonDivisorB[j]){
                    numberCount++;
                    k++;
                } else {
                    primeFactorsB[i-1]=commonDivisorB[j-1];
                    primeFactorsCountB[i-1]=numberCount;
                    k++;
                    break;
                }
            }
        }

        // 값 비교 및 출력

        int primeFactorsLenght=Math.min(primeFactorsA.length,primeFactorsB.length);

        k=0;

        for (int i=0;i<primeFactorsLenght;i++){
            for (int j=k;j<primeFactorsLenght;j++){
                if (primeFactorsA[i]==0){
                    break;
                } else if (primeFactorsB[j]==0) {
                    break;
                } else if (primeFactorsA[i]<primeFactorsB[j]) {
                    break;
                } else if (primeFactorsA[i]>primeFactorsB[j]) {
                    k++;
                    continue;
                } else if (primeFactorsA[i]==primeFactorsB[j]){
                    int minNumber=Math.min(primeFactorsCountA[i],primeFactorsCountB[j]);
                    greatestCommonDivisor*=(int)Math.pow(primeFactorsA[i],minNumber);
                }
            }
        }

        System.out.println(greatestCommonDivisor);
        System.out.println(leastCommonMultiple);

    }
}
