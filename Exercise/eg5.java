package Exercise;

import java.util.Scanner;

public class eg5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int p=1;
        for(int i=2; i<n; i++){
                if(n%i == 0){
                    p=0;
                }
            }
            if(p==1){
                System.out.println("\n"+n+" is a prime number.");
            }
            else{
                System.out.println("\n"+n+" is not a prime number.");
            }
        }
}
