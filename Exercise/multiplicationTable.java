package Exercise;

import java.util.Scanner;

public class multiplicationTable {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i =1; i<=10; i++){
            int p = n*i;
            System.out.println(n+"x"+i+"="+p);
        }
    }  
}
