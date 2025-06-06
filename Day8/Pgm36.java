package Day8;

//
class outer{
    private String msg = "primsg from outer class";
    class inner{
        void display(){
            System.out.println(msg);//Outer class private object is accessible in inner class
        }
    }
    static class sInner{
        void display(){
            System.out.println("This is from static inner class");
        }
    
    }
}
class Defaultclass{
    String defmsg = "def msg in def class and accessible within this package only";
}
class mod{
    public String pubmsg ="pub msg in acc mod accessed anywhere";
    private String primsg ="pri msg in acc mod, accessed by displayprivate in this class which is public";

    private void displayprivate(){
        System.out.println(primsg);
    }

    Defaultclass dc = new Defaultclass();
    public void displayall(){
            System.out.println(dc.defmsg);
            System.out.println(pubmsg);
            displayprivate();
    }
}

public class Pgm36 {
    public static void main(String[] args) {
        mod access = new  mod();
        access.displayall();
        outer obj = new outer();
        outer.inner inobj = obj.new inner();
        inobj.display();
        outer.sInner sobj = new outer.sInner();
        sobj.display();

    }
}    

