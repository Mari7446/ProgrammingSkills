package Exercise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count =2;
        int n1=0;
        int n2=1;
        System.out.println("\nFibonacci Series:");
        System.out.println(n1);
        System.out.println(n2);
        while(count<n){
            int nxt =n1+n2;
            System.out.println(nxt);
            n1=n2;
            n2=nxt;
            count++;
        }
    }
}
