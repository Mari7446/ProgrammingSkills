package Day6;

public class Pgm30 {
    public static void main(String[] args) {
        String s = "hello";
        String t ="";
        int count=0;
        for(int i=s.length()-1; i>=0; i--){
            t += s.charAt(i);
        }
        System.out.print(t+"\n");
        System.out.print(s+"\n");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t.charAt(i)){
                count++;
        }
        else{
            break;
        }
    }
    if(count==s.length()){
        System.out.print("Palindrome");
    }
    else{
        System.out.print("Not a Palindrome");
    }
    }
}
