package Day4;
import java.util.Arrays;
import java.util.Scanner;
public class Pgm13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] RollNo =new int[50];//Dynamic Array
        RollNo[0]=1;
        System.out.println("1] "+RollNo[0]);
        for(int i=1; i<RollNo.length; i++){
            RollNo[i]=RollNo[i-1]+1;
            System.out.println((i+1)+"] "+RollNo[i]);
        }
        int sum=0;
         for(int j=1; j<RollNo.length; j++){
            sum=sum+RollNo[j];
        }
        System.out.println(Arrays.toString(RollNo));
        System.out.println("The sum is "+sum);
    }
}

