package Day4;
import java.util.Scanner;
public class Pgm15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of the array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0; i<n; i++){
            System.out.println("Enter elements of the array one by one:");
            arr[i] =sc.nextInt();
        }
        int sum=0;
        for(int j=0; j<n; j++){
            sum=sum+arr[j];

        }
        System.out.println("the sum is "+sum);
    }
}
