package Exercise;

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum=0;
        for(int i =1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("The sum of natural numbers upto "+n+" is "+sum);
    }
}
