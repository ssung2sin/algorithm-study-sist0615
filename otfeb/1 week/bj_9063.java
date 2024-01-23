package bj_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9063 {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine());
      int[] arr1 = new int[n];
      int[] arr2 = new int[n];
      
      int max1 = -10000;
      int min1 = 10000;
      int max2 = -10000;
      int min2 = 10000;
      
      for(int i=0;i<n;i++) {
         String s = br.readLine();
         StringTokenizer st = new StringTokenizer(s," ");
         arr1[i] = Integer.parseInt(st.nextToken());
         arr2[i] = Integer.parseInt(st.nextToken());
      }
      
      for(int j=0;j<n;j++) {
         if(max1<arr1[j]) {
            max1 = arr1[j];
         }
         if(min1>arr1[j]) {
            min1 = arr1[j];
         }
         if(max2<arr2[j]) {
            max2 = arr2[j];
         }
         if(min2>arr2[j]) {
            min2 = arr2[j];
         }
      }
      int result = (max1-min1)*(max2-min2);
      System.out.println(result);
   }

}