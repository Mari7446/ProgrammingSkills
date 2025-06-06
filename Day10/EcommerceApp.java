package Day10;

interface PaymentGateway{
    boolean processpayment(double amount);
    String getTransactionID(String trnsid);
}

class CreditCard implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing payment $"+amount);
        return true;
    }
    public String getTransactionID(String trnsid){
        return "Credit Card Transaction ID: "+trnsid;
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        
    }
}
