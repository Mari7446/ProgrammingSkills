package Exercise;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to be reversed:");
       int n = sc.nextInt();
       int r = 0;
       while(n!=0){
        int l = n%10;
        r = r*10+l;
        n=n/10;
       }
       System.out.println("Reversednumber:"+r); 
    }
}
