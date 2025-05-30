package Day1;
/*If else */
import java.util.Scanner;
public class Pgm8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name:\n"); 
      String name = sc.nextLine();
      System.out.println("Enter your register number:\n"); 
      int reg = sc.nextInt();
      System.out.println("Enter your total numer of subjects:\n"); 
      int sub = sc.nextInt();
      int[] mymark= new int[sub+1];
      for(int i =0; i< sub; i++){
        System.out.println("Enter your subject marks one by one:");
        mymark[i] = sc.nextInt();
        System.out.println("\n");
      }
      System.out.printf("Hi %s your Register number is %d.\n", name, reg);
      for(int j =0; j< sub; j++){
        if (mymark[j] < 35){
            System.out.printf("\nMark%d = %d; Status = Fail; Grade = U\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=35 && mymark[j] < 50){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = E\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=50 && mymark[j] < 60){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = D\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=60 && mymark[j] < 70){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = C\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=70 && mymark[j] < 80){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = B\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=80 && mymark[j] < 90){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = A\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=90 && mymark[j] < 100){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = S\n",j+1, mymark[j]);
        }
        else{
            System.out.printf("\nMark%d = %d; Status = Centum; Grade = O\n",j+1, mymark[j]);
        }
      }
      int total = 0, k=0;
      while( k<sub){
        total = total + mymark[k];
        k++;

      }
      int avg = total/sub;
      char c ='1';
      if (avg >75){
        c = '1';
      }
      else if (avg >= 60 && avg <=75){
        c = '2';
      }
      else if(avg >=50 && avg <60)
      {
        c ='3';
      }
      else if (avg >= 40 &&  avg <50)
      {
        c ='4';
      }
      else{
        c = '5';
      }

      switch(c){
        case '1':System.out.printf("Mark Average = %d\nYou have Passed in First Class with DISTINCTION",avg);
          break;
        case '2':System.out.printf("Mark Average = %d\nYou have Passed in First Class",avg);
          break;
        case '3': System.out.printf("Mark Average = %d\nYou have Passed in Second Class",avg);
          break;
        case '4': System.out.printf("Mark Average = %d\nYou have Passed in Pass Class",avg);
          break;
        default : System.out.printf("Mark Average = %d\nYou have FAILED",avg);
      }
      }
    }

