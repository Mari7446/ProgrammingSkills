package Day6;

import java.util.*;
import java.util.Scanner;
public class Pgm24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(), count =1;
        int[] arr= new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        } 
        sc.close();
        Arrays.sort(arr);
        int max =arr[arr.length -1];
        
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        } 
        int[] copy= new int[max+1];
        for(int i=0; i < n; i++){
            copy[arr[i]]++;

        } 
        for(int i=0; i<copy.length; i++){
            if(copy[i]>0){
                System.out.print(i+":"+copy[i]+" ");
            }
        }      //Ssytem.out.
    }
}
