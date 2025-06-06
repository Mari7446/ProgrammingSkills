package Day8;

class sara{
    static int i=0;/**Static Variable:Ingnores the next objects .keeps on counting when the same class is called by different objects. like for calling first time with object 1 it will print 0 and the second time with another object it will print 1**/
    int count =0;/**Instance variable**/
    sara(){
        System.out.println(i++);
    }
    void sundari(){
        int n=5; /**Local Variable**/
    }
}

public class Pgm40 {
    static{
        int a=76;
        System.out.print("\n\n"+a+" is from static\n");
    }
    public static void main(String[] args) {
        /*Command Line Argument */
        System.out.println("Number of arguments: "+args.length);
        for(int i=0; i<args.length; i++){
            System.out.println("Argument "+(i+1)+":"+args[i]);
        }
        sara s1= new sara();
        sara s2= new sara();
        sara s3= new sara();
        sara s4= new sara();
        sara s5= new sara();
        sara s6= new sara();
        sara s7= new sara();
    }
}
