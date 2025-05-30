package Day1;
//swapping two variables
public class Pgm2{
    public static void main(String[] args){
        int  a = 7, m = 6;
        int t = a;
        a = m;
        m = t;
        System.out.printf("a = %d, m = %d", a, m);
    }
}