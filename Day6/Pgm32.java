package Day6;

public class Pgm32 {

    public static void main(String[] args) {
        String s = "eat";
        int i = 0;
        int j = s.length() - 1;
        boolean Palindrome = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                Palindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (Palindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}

