import java.util.Scanner;
import java.util.Random;

class RandomNumber {
    public static void main(String args[]) {
        Random num = new Random();
        int numbertoGuess = num.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guessnum;
        int count;
        System.out.println("Lets play a game to guess a Random Number!!!");
        System.out.println("Let me choose a random number for you...you have 6 chances to guess it right!!!");
        count = 0;
        System.out.println("Guess the number between 1 to 100:");

        while (true) {
            guessnum = sc.nextInt();
            count++;
            if (guessnum == numbertoGuess) {
                System.out.println("Congratulations you guessed it right:)");
                break;
            }
            if (count == 6) {
                System.out.println("You did not guess the number!!");
                System.out.println("GAME OVER!!!");
                break;
            }
            if (guessnum < numbertoGuess) {
                System.out.println("too low guess...try again:(");
            } else {
                System.out.println("too high guess...try again:(");
            }
        }
    }
}
