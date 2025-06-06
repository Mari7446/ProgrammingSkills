package Exercise;

import java.util.*;
public class eg26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max =Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        int b[] = new int[max+1];
        for(int i=0; i<n; i++){
            b[a[i]]=a[i];
        }
        System.out.print("Missing numbers: ");
        //System.out.print(min +"min\n");
        for(int i=min; i<b.length; i++){
            if(b[i]==0){
                System.out.print(i+" ");
            }
        }
    }
}
