package Day2;
import java.util.Scanner;
public class Pgm9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int num = sc.nextInt();
        for(int i = 1 ; i< 11; i++){
            int p = i*num;
            System.out.printf("\n%d x %d = %d", i, num,p);
        }
        System.out.printf("\n\n");
        for(int i = 1 ; i< 11; i++){
            int p = i*num;
            System.out.println(i + " x " + num + " = " + p);
        }
    }
}
