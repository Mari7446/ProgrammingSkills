package Day2;
import java.util.Scanner;
public class Pgm11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("\n\n");
        do{
            num++;
            System.out.println(num);
        }while(num<100);
    }
}
