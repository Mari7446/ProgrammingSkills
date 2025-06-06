package Exercise;

class Student{
    void displayDetails(String name, int RollNo, float marks){
        System.out.println("Student Name: "+name);
        System.out.println("Roll.No: "+RollNo);
        System.out.println("Mark: "+marks);
    }
    int display(int a, int b){
        return a+b;
    }
    void displayNothing(){
        System.out.println("Hi");
    }
    int displaySomething(){
        int a=5, b=8;
        return a+b;
    }
}
public class eg27 {
    public static void main(String[] args) {
      Student obj = new Student();  
      //obj.displayDetails("Muthumari S", 5422, 90);
      //stem.out.println(obj.display(5,5));
      //obj.displayNothing();
      System.out.println(obj.displaySomething());
    }
}
