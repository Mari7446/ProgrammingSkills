package Day6;

public class Pgm31 {
    public static void main(String[] args) {
        String s="MALAYALA";
        int i=0, j=s.length()-1, flag =0;;
        char[] c= s.toCharArray();
        for(i=0;i<j; i++){
            if(c[i]==c[j]){
                break;
            }
            else{
                flag=1;
            }
            j--;
    }
    if(flag==0){
               System.out.print("Palindrome");
            }
    else{
                System.out.print("Not Palindrome");
            }
}
}
