package Day2;
import java.util.Scanner;
public class Pgm10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        while(num != 0){
            System.out.println(num+"\n");
            num = num/2;
        }
    }
}
