package Day3;

public class Pgm17 {
    public static void main(String[] args){
        for(int i=0; i<9; i++){
            for(int j=i; j<9; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
