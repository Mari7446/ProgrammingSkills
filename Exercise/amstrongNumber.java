package Exercise;

import java.util.Scanner;
public class amstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),t=n,temp = n,count=0,sum=0;
        while(t!=0){
            t/=10;
            count++;
        }
        //System.out.print(count);
        while(temp!= 0){
            int last=temp%10;
            sum += (int)Math.pow(last, count);
            //System.out.print(last+" ");
            //System.out.print((last^count)+" ");
            temp/=10;
        }
        //System.out.print(sum);
       if(sum==n){
             //System.out.print(sum);
             System.out.print("Amstrong Number");
        }
        else{
            //System.out.print(sum);
            System.out.print("Not an amstrong number");
        }
    }
}
