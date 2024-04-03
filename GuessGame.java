import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){
        int num_generator = (int)(Math.random() * 100);
        int secret_num = num_generator;
        int count = 3;

        System.out.println("➡\uFE0FGuess a number from 0 to 100");
        System.out.println("➡\uFE0FYou'll get only 3 chances");
        System.out.println("--------------------------------");

        for(int i = count; i > 0; i--){
            System.out.print("\uD83E\uDD14Guess: ");

            Scanner num = new Scanner(System.in);
            int guess = num.nextInt();

            if(guess == secret_num){
                System.out.println("Congrats \uD83E\uDD73!!You Won!! :)");
                break;
            }else{
                System.out.println("Ouch ❤\uFE0F\u200D\uD83E\uDE79!!Try Again!! :(");
                System.out.println("--------------------------------");
                if(i == 1){
                    System.out.print("\uD83D\uDE0CThe correct Answer is: ");
                    System.out.println("\uD83C\uDF89" + secret_num + "\uD83C\uDF89");
                }
            }
        }
    }
}
