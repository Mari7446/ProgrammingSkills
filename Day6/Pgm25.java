package Day6;

import java.util.*;
public class Pgm25 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine(), s2 =sc.nextLine();
       int count =0;
       char [] c1 = s1.toCharArray(), c2 = s2.toCharArray();
       int [] a1 = new int[26];
       int [] a2 = new int[26];
       //for(int i=0; i< a1.length; i++){
           // a1[i] = (i+1);
            //a2[i] = (i+1);
       //}
       for(int i=0; i<a1.length; i++){
        a1[c1[i]]++;
        
       }
        for(int i=0; i<a1.length; i++){
        System.out.print(a1[i]+" ");
        
       }
       for(int i=0; i<a2.length; i++){
        a2[c2[i]]++;
       }
       for(int i=0; i<a2.length; i++){
        System.out.print(a2[i]+" ");
        
       }
      
       for(int i=0;i<a1.length; i++){
            for(int j=0; j<a2.length; j++){
            
                if (c1[i]==c2[j]){
                   
                    System.out.println("Anagram");
                }
                else{
                    System.out.print("not anagram");
                }
            }
        }
        
       
          
    }
}
