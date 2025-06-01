package Exercise;

import java.util.Scanner;
public class eg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while(n !=0){
            int last = n%10;
            sum += last;
            n /= 10;
        }
        System.out.print(sum);
    }
}
