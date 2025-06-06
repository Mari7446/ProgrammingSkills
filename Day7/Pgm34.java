package Day7;

import java.util.*;
public class Pgm34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println(" Welcome to Hand Cricket!");
        System.out.println("Enter numbers between 1 to 6");

       
        System.out.println("\nYou are batting first:");
        while (true) {
            System.out.print("Your run: ");
            int user = sc.nextInt();
            int comp = rand.nextInt(6) + 1;
            System.out.println("Computer bowled: " + comp);

            if (user == comp) {
                System.out.println("You're OUT!");
                break;
            } else {
                userScore += user;
            }
        }

        System.out.println("Your total score: " + userScore);

        System.out.println("\nComputer is batting now:");
        while (true) {
            System.out.print("Your bowl: ");
            int user = sc.nextInt();
            int comp = rand.nextInt(6) + 1;
            System.out.println("Computer played: " + comp);

            if (user == comp) {
                System.out.println("Computer is OUT!");
                break;
            } else {
                computerScore += comp;
                if (computerScore > userScore) {
                    break;
                }
            }
        }

        System.out.println("Computer's total score: " + computerScore);

        
        System.out.println("\n Result:");
        if (userScore > computerScore) {
            System.out.println("You Win!");
        } else if (userScore < computerScore) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("It's a Tie!");
        }  
    }
}
