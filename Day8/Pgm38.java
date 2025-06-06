package Day8;

class ram{
    ram(){
    System.out.println("This is message in from the constructor ram()");}
    ram(int a){
        System.out.println("Int "+a);
    }
    ram(double a){
        System.out.println("double "+a);
    }
}
public class Pgm38 {
    public static void main(String[] args) {
    ram ramInMain=  new ram(7.123456fff);   
    }
}
