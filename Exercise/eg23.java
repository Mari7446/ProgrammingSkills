package Exercise;

/*Find all elements that are greater than all elements to their right */
public class eg23 {
    public static void main(String[] args) {
        boolean flag=false;
        int [] a = {16, 17, 4, 3, 5, 2};
        for(int i=0; i<a.length; i++){
            for(int j=a.length-1; j>i; j--){
                if(a[i]<a[j]){
                    flag =false;
                    //System.out.print(a[i]+"<"+a[j]+"\n");
                    break;
                }
                else{
                    flag = true;
                }
            }
            if(flag==true){
                System.out.println(a[i]);
            }
        }
    }
}
