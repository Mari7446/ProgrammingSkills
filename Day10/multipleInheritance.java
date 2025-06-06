package Day10;

interface hr{
    //Data member and member methid can be used.
    //In interface data member is constant
    int a=10;
    void display();
    int add(int a, int b);
    void sum(int a, int b);
}
interface finance{
    void budjet();
}
interface operations{
    void SOP();
}
class OffCore{
    void Law(){
        System.out.println("Indian law");
    }
}
class Office extends OffCore implements hr,finance,operations{
    public void display(){    //this is from the interface hr
        System.out.println("This is from the interface hr "+a);
    }
    public void budjet(){
        System.out.println("This is from interface budjet");
    }
    public void SOP(){
        System.out.println("This is from operations.");
    }
    void show(){
        System.out.println("And overall this is known as Multiple inheritance where multiple superclasses are inherited by a single sub class.");
    }
    public int add(int a, int b){
        return a+b;
    }
    public void sum(int a, int b){
        System.out.println(a+b);
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        Office O = new Office();
        O.display();
        O.budjet();
        O.SOP();
        O.show();
        O.Law();
        System.out.println(O.add(7,6));
        O.sum(3,4);
    }
}
