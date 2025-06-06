package Day10;

abstract class service{
    int a=6;
    void settings(){

    }
    abstract void profile();
}
class mari extends service{
    void profile(){
        System.out.println("I CAN");
    }
}
public class abst {
    public static void main(String[] args) {
        mari M = new mari();
        M.profile();
    }
}
