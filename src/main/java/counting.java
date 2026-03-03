import java.util.Random;
import java.util.Scanner;


public class counting {

    static void main(String[] args) {
        Random r=new Random();
        Scanner input = new Scanner(System.in);
        int turns = 3;
        int num = r.nextInt(50);
        System.out.println("A number is chosen from 0 to 50");
        System.out.println("You have " + turns + " turns to guess");
        for (int i = 0; i < turns; i++){
            System.out.print("Enter your guess: ");

            try{
                int guess = input.nextInt();

                if (guess == num){
                    System.out.println("YOU WIN");
                    input.reset();
                    return;
                } else if (guess > num ) {
                    System.out.println("TOO HIGH");
                } else if (guess < num ) {
                    System.out.println("TOO LOW");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Enter a Integer");
            }

        }

        System.out.println("YOU LOSE! The number was:" + num);
    }
}
