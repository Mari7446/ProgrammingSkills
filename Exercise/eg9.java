package Exercise;

import java.util.Scanner;
public class eg9 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sod = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sod +=i;
            }
        }
        if(n == sod){
            System.out.print("Perfect Number");
        }
        else{
            System.out.print("Not a perfect Number");
        }
    } 
}
