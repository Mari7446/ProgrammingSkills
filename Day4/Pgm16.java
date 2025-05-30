package Day4;

import java.util.Scanner;
public class Pgm16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n= sc.nextInt();
        System.out.println("Enter the key element:");
        int k =sc.nextInt();
        perform(n, k);
    }

        static void perform(int num, int key ){
            Scanner sc = new Scanner(System.in);
            int[] arr= new int[num];
        for(int i=0; i<num; i++){
            System.out.println("Enter the element:");
            arr[i]=sc.nextInt();

        }
        for(int i=0; i<num; i++){
            if(arr[i]==key){
                System.out.println("Index no :"+i);
            }
            else{
                System.out.println(key+" is not present");
            }
        }
    
        }
    
}
