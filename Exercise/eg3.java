package Exercise;

import java.util.Scanner;

public class eg3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int p=1;
        for(int i =1; i<=n; i++){
            p=p*i;
        }
        System.out.println("The factorial of "+n+" is "+p);
    }
}
