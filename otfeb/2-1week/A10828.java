package bj_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class A10828 {

   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      String result = "";
      
      Stack<Integer> stack = new Stack<Integer>();
      
      while(n>0) {
         String s = br.readLine();
         String[] arr = s.split(" ");
         
         if(arr[0].equals("push")) {
            stack.push(Integer.parseInt(arr[1]));
         }
         else if(arr[0].equals("pop")) {
            if(!stack.empty()) {
               result+=stack.pop()+"\n";
            }
            else {
               result+="-1\n";
            }
         }
         else if(arr[0].equals("size")) {
            result+=stack.size()+"\n";
         }
         else if(arr[0].equals("empty")) {
            if(stack.empty()) {
               result+="1\n";
            }
            else {
               result+="0\n";
            }
         }
         else if(arr[0].equals("top")) {
            if(!stack.empty()) {
               result+=stack.peek()+"\n";
            }
            else {
               result+="-1\n";
            }
         }
         n--;
      }
      bw.write(result);
      bw.flush();
   }

}