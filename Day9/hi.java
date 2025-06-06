package Day9;
import com.homepage.home.java;

import Day9.com.homepage.home.java;
class math{
    void formula(){
        System.out.println("(A+B)^2");
    }
}
class social extends math{
    void d(){
        System.out.println("Social");
    }
}
class chemistry extends math{
    void display(){
        System.out.println("Nothing");
    }
}
class physics extends math{
    void display1(){
        System.out.println("This is Physics");
    }
}
public class hi {
    public static void main(String[] args) {
       /* hello h = new hello();
        h.display();
        home h1 = new home();
        h1.display1();*/
        physics py = new physics();
        //py.display();
        py.formula();
        py.display1();
        social sc = new social();
        sc.d();
        sc.formula();
    }
}
