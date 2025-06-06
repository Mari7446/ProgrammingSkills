package Exercise;

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%4==0 && y%100 != 0){
            System.out.print("Leap year");
        }       
        else if (y%400==0){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a leap year");
        }
    }
}
