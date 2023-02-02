// little game
import java.util.Scanner;

public class Main // our class that is public throughout the program
{
    public static void main(String[] args) // main function/method
    {
        Scanner Sc = new Scanner(System.in);
        int Integer1, Integer2, Sum; // the numbers
        System.out.println("HI! LETS PLAY A GAME!!!");
        System.out.println("Guess my number, you have two chances! ");
        System.out.println("Please enter your first guess that is around 1-20 :"); // asking the user to give the first integer
        Integer1 = Sc.nextInt();
        if(Integer1 == 1 || Integer1 == 2 || Integer1 == 3 || Integer1 == 4 || Integer1 == 5 || Integer1 == 6 || Integer1 == 7 || Integer1 == 8 || Integer1 == 9 || Integer1 == 10 ||Integer1 == 11 || Integer1 == 12 || Integer1 == 13 || Integer1 == 14 || Integer1 == 15 || Integer1 == 16 || Integer1 == 17 || Integer1 == 18 || Integer1 == 19 || Integer1 == 20){
            System.out.println("Unfortunately, You are WRONG! :(");
            System.out.println(" ");
            System.out.println("You have one more try!");
        }
        System.out.println("Please enter your second guess that is around 1-20 :"); // asking the user to give the second integer
        Integer2 = Sc.nextInt();
        if(Integer2 == 1 || Integer2 == 2 || Integer2 == 3 || Integer2 == 4 || Integer2 == 5 || Integer2 == 6 || Integer2 == 7 || Integer2 == 8 || Integer2 == 9 || Integer2 == 10 ||Integer2 == 11 || Integer2 == 12 || Integer2 == 13 || Integer2 == 14 || Integer2 == 15 || Integer2 == 16 || Integer2 == 17 || Integer2 == 18 || Integer2 == 19 || Integer2 == 20){
            System.out.println("SORRY! YOU ARE WRONG! :( ");
        }
        if(Integer1 == 1 || Integer2 == 2 || Integer1 == 2 || Integer2 == 3 || Integer1 == 4 || Integer2 == 5 ||Integer1 == 6 || Integer2 == 7 || Integer1 == 8 || Integer2 == 9 || Integer1 == 10 || Integer2 == 11 || Integer1 == 12 || Integer2 == 13 || Integer1 == 14 || Integer2 == 15 || Integer1 == 16 || Integer2 == 17|| Integer2 == 18 || Integer1 == 19 || Integer2 == 20){
            System.out.println("YOUR WRONG LOL!!!");
            System.out.println("GG - Get Good (PS: with all do respect)");
        }

    }
}
