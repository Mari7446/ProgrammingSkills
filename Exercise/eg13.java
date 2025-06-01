package Exercise;

import java.util.Scanner;
public class eg13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt(), n2=sc.nextInt(), gcd=1, lcm=0, min=0;
        if(n1<n2){
            min=n1;
        }
        else{
            min=n2;
        }
        for(int i=min; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
        lcm=(n1*n2)/gcd;
        System.out.println(lcm);
    }
}
