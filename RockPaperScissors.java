//Declaring Scanner, Random, and DecimalFormat
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class RockPaperScissors{
  public static void main(String[] args){

    //--------------------------------------------------------------------------
    //Declares main variables needed for gameplay/end

    double wins = 0;
    double games = 0;
    boolean play = true;

    //--------------------------------------------------------------------------
    //Begins while loop

    while (play==true) {

      //------------------------------------------------------------------------
      //Counts games, gets user input and begins checking procedure

      games++;
      Scanner scan = new Scanner(System.in);
      System.out.println("Pick rock, paper, or scissors: ");
      String firstInput = scan.nextLine();
      String input = firstInput.toLowerCase();
      boolean inputWorks = false;

      //------------------------------------------------------------------------
      //Checks that the user chose a valid input

      while (inputWorks == false){
        if (input.equals("rock")){
          break;
        }
        if (input.equals("paper")){
          break;
        }
        if (input.equals("scissors")){
          break;
        }
        else{
          System.out.println("Not a valid input. Pick rock, paper, or scissors: ");
          firstInput = scan.nextLine();
          input=firstInput.toLowerCase();
          inputWorks=false;
        }
      }

      //------------------------------------------------------------------------
      //Sets player word choice to a number than can later be compared
      //1=rock 2=paper 3=scissors

      int playerChoice = 0;
      if (input.equals("rock")){
        playerChoice=1;
      }
      if (input.equals("paper")){
        playerChoice=2;
      }
      if (input.equals("scissors")){
        playerChoice=3;
      }

      //------------------------------------------------------------------------
      //Generates a random number using the same key as above

      Random rand = new Random();
      int computerChoice = rand.nextInt(3)+1;
      String computerChoiceWord = "";
      if (computerChoice == 1){
        computerChoiceWord = "rock";
      }
      if (computerChoice == 2){
        computerChoiceWord = "paper";
      }
      if (computerChoice == 3){
        computerChoiceWord = "scissors";
      }

      //------------------------------------------------------------------------
      // Recieve user selection of rock, paper, or scissors and test to see if
      // they tied, sets boolean play to true so game continues to play

      Scanner playScan = new Scanner(System.in);
      String playInput = "";
      if (computerChoice == playerChoice) {
        System.out.println("The computer has chosen " + computerChoiceWord +
         " and you chose " + input + ", you tied!");
        play=true;
      }

      //------------------------------------------------------------------------
      // Conditional if-statements to diplay that the user has won & ask if
      // they would like to play again

      if ((computerChoice == 1 && playerChoice == 2) ||
      (computerChoice == 2 && playerChoice == 3) ||
      (computerChoice == 3 && playerChoice == 1)) {
      System.out.println("The computer has chosen " + computerChoiceWord +
      " and you chose " + input + ", you won!");
      wins++;
      System.out.println("Do you want to play again? Type y or n");
      playInput = playScan.next();
        if (playInput.equals("y")){
          play = true;
        }
        else{
          play = false;
        }
      }

      //------------------------------------------------------------------------
      // Conditional if-statements to diplay that the user has lost & ask if
      // they would like to play again

      if ((computerChoice == 3 && playerChoice == 2) ||
      (computerChoice == 2 && playerChoice == 1) ||
      (computerChoice == 1 && playerChoice == 3)){
      System.out.println("The computer has chosen " + computerChoiceWord +
      " and you chose " + input + ", you lost");
      System.out.println("Do you want to play again? Type y or n");
      playInput = playScan.next();
        if (playInput.equals("y")){
          play = true;
        }
        else{
          play = false;
        }
      }

    //--------------------------------------------------------------------------
    //Ends while loop

    }

    //--------------------------------------------------------------------------
    // Calculate and display user's win percentage

    double winPercentage = (wins/games)*100;
    DecimalFormat fmt = new DecimalFormat("#0.0");
    System.out.println("Your win percentage is "+fmt.format(winPercentage)+"%.");

    //--------------------------------------------------------------------------
  }
}
