package Day10;

interface notificationSystem{
    void sendNotification(String recipient, String alert);
}   
interface getData{
    double readValue(double temp);
    String getSensorType(String sensor);
} 
interface cloud{
    void uploadFiles(String filename, int size);
}

class ext implements notificationSystem, getData, cloud{
    public double readValue(double temp){
        return temp;
    }
    public String getSensorType(String sensor){
        return sensor;
    }
    public void sendNotification(String recipient, String alert){
        System.out.printf("Hi! %s %s.\n",recipient, alert);
    }
    public void uploadFiles(String filename, int size){
        System.out.println("The cloud storage is "+filename+ " of size "+size+"TB.");
    }
}
public class smartHome {
    public static void main(String[] args) {
        ext e = new ext();
        e.sendNotification("Mari","Raining");
        System.out.println("The sensor is "+e.getSensorType("temperature ")+"sensor and the value is "+e.readValue(25.37)+"C."  );
        e.uploadFiles("AWS", 190);
    }
}
