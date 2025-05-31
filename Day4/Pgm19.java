package Day4;

import java.util.Scanner;
public class Pgm19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
    
        }
        
        for(int i =0; i<n; i++){
            if(min>arr[i]){
                min=arr[i];
                int m = i;
            }
            if(max<arr[i]){
                max=arr[i];
                int k=i;

            }

    
        }
        
        System.out.println("max "+max);
        System.out.println("min " +min);

        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]!= max && arr[i] != min){
                arr2[i] =arr[i];
            }
            else{
                break;
            }
        }
         int  min2 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE;

         for(int i =0; i<n; i++){
            if(min2>arr2[i]){
                min2=arr2[i];
              
            }
            if(max2<arr2[i]){
                max2=arr2[i];
          

            }

    
        }
        
        System.out.println("2nd max "+max2);
        System.out.println("2nd min " +min2);
    }
}
