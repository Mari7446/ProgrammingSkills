package Exercise;

import java.util.Scanner;
public class eg15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double num=0, sum=0;
        for(double i=1; i<=n; i++){
            num=1/i;
            sum += num;
        }
        System.out.print(sum);
    }
}
