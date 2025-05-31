package Day2;

import java.util.Scanner;

public class Pgm23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] RollNo =new int[50];
        RollNo[0]=5001;
        System.out.println("1] "+RollNo[0]);
        for(int i=1; i<RollNo.length; i++){
            RollNo[i]=RollNo[i-1]+1;
            System.out.println((i+1)+"] "+RollNo[i]);
        }
    }
}
