package Exercise;

import java.util.*;
public class eg24 {
    public static void main(String[] args) {
        int n=6, temp=0;
        int[] a = new int[n], cpy= new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-1; i>=0; i--){
            if(a[i]>temp){
                temp = a[i];
                cpy[i] = temp;
            }
        }
        for(int i:cpy){
            if(i != 0){
                System.out.print(i+" ");
            }
        }

    }
}
