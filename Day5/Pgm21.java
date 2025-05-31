package Day5;

import java.util.Scanner;
public class Pgm21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int [][] arr=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    
int sum=0;
int[] sum_arr = new int[3];
        for(int i =0; i<3; i++){
            sum=0;
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+"  ");
                sum += arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println();
        System.out.println();
         for(int j =0; j<3; j++){
            sum=0;
            for(int i=0; i<3; i++){
                System.out.print(arr[j][i]+"  ");
                sum += arr[i][j];
            }
            
            
                sum_arr[j]=sum;

            
            System.out.println();
        }
        for(int i=0; i<3; i++)
        {
            System.out.print(sum_arr[i]+" ");
        }
    }
}
