
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        String[] rps = {"Rock", "Paper", "Scissor"};
        String computerMove = rps[new Random().nextInt(rps.length)];

       
        String playerMove;

        while(true)
        {
            System.out.println("Please enter your move:  ");
            System.out.println("Rock, Paper, Scissor");
            playerMove = sc.nextLine();
            if( playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissor") ){
                break;
            }
            System.out.println(playerMove + " is not a valid move.");
        }
        System.out.println("Computer played: " + computerMove);

        if (playerMove.equals(computerMove)){
            System.out.println("The game was a tie!!");
        } else if (playerMove.equals("Rock")) {
            if(computerMove.equals("Paper")){
                System.out.println("You lose!");
            }
            if(computerMove.equals("Scissor")){
                System.out.println("You win!");
            }

        }
        else if (playerMove.equals("Paper")) {
            if(computerMove.equals("Rock")){
                System.out.println("You win!");
            }
            if(computerMove.equals("Scissor")){
                System.out.println("You lose!");
            }

        }

        else if (playerMove.equals("Scissor")) {
            if(computerMove.equals("Paper")){
                System.out.println("You win!");
            }
            if(computerMove.equals("Rock")){
                System.out.println("You lose!");
            }

        }

        System.out.println("Play again? (y/n)");
        String playAgain = sc.nextLine();

        if(!playAgain.equals("y")){
            break;
        }
    }


    }
}
