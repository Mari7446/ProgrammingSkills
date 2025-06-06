package Exercise;

import java.util.Scanner;
public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        char op = sc.next().charAt(0);
        int result=0;
        switch(op){
            case '+' : result=n1+n2;
                break;
            case '-' : result=n1-n2;
                break;
            case '*' : result=n1*n2;
                break;
            case '/' : result=n1/n2;
                break;
        }
        System.out.println(result);
    }
}
