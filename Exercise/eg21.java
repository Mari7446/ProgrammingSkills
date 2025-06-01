package Exercise;

import java.util.Scanner;
public class eg21 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int temp=n;
       int r = 0;
       while(n!=0){
        int l = n%10;
        r = r*10+l;
        n=n/10;
       }
       if(temp==r){
        System.out.print("Palindrome");
       }
       else{
        System.out.print("Not palindrome");
       }
   } 
}
