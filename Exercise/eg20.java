package Exercise;

import java.util.Scanner;
public class eg20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char g = '0';
        if(n>=90){
            g = 'A';
        }
        else if(n>=80){
            g = 'B';
        }
        else if(n>=70){
            g = 'C';
        }
        else if(n>=60){
            g = 'D';
        }
        else{
            g = 'F';
        }
        System.out.print(g);
}
}
