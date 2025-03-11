import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int right=0,count=0,wrong=0;
        while(true){
            Random rand = new Random();
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("Enter Number to Check (1 - 100) : ");
            int guess=sc.nextInt();
            while (true) { 
                count++;
                if(randomNumber==guess){
                    right++;
                    System.out.println("Congratulations! You have guessed the number in "+count+" attempts");
                    break;
                }

                else{
                    wrong++;
                    if(randomNumber>guess){
                        System.out.println("Try Higher Number");
                    }
                    else{
                        System.out.println("Try Lower Number");
                    }
                    System.out.println("Enter Number to Check (1 - 100) : ");
                    guess=sc.nextInt();
                }
            }
            System.out.println("Right : "+right+" Wrong : "+wrong);
            System.out.println("Do you want to play again? (1/0)");
            int play=sc.nextInt();
            if(play<1){
                break;
            }
        }
        System.out.println("Number of guesses : "+count+" Right : "+right+" Wrong : "+wrong+" ");
        if(right>wrong){
            System.out.println("You are a Genius!");
        }
        else if(right==wrong){
            System.out.println("You are a Good Guesser!");
        }
        else{
            System.out.println("You are a Bad Guesser! Try Again!");
        }
        System.out.println("Game Over!");
    }
}