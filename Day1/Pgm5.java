package Day1;
//**Grade**//
import java.util.Scanner;
public class Pgm5 {
    public static void main(String[] args){
        System.out.println("Enter your name:\n");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("\nEnter your reg no:\n");
        int reg = sc.nextInt();
        System.out.println("\nEnter your mark in english:\n");
        int a= sc.nextInt();
        System.out.println("\nEnter your mark in maths:\n");
        int b= sc.nextInt();
        System.out.println("\nEnter your mark in science:\n");
        int c= sc.nextInt();
        int total = (a +b +c);
        int avg = total/3;
        System.out.printf("Hi %s your total mark is %d and your average is %d", name, total, avg);
    }
}
