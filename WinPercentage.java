import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage {

  public static void main (String[] args){
    Scanner userInput = new Scanner(System.in);
      System.out.println("Enter the number of games you have played: ");
      double gamesPlayed = userInput.nextDouble();
      System.out.println("Enter the number of games you have won: ");
      double gamesWon = userInput.nextDouble();
      boolean inputsValid = false;

    while (inputsValid == false){
      int gamesPlayedInt = (int) gamesPlayed;
      int gamesWonInt = (int) gamesWon;
      if (gamesPlayedInt!=gamesPlayed){
        System.out.println("Inputs must be integers\n");
        System.out.println("Enter the number of games you have played: ");
        gamesPlayed = userInput.nextDouble();
        System.out.println("Enter the number of games you have won: ");
        gamesWon = userInput.nextDouble();
      }
      else if (gamesWonInt!=gamesWon){
        System.out.println("Inputs must be integers\n");
        System.out.println("Enter the number of games you have played: ");
        gamesPlayed = userInput.nextDouble();
        System.out.println("Enter the number of games you have won: ");
        gamesWon = userInput.nextDouble();
      }
      else if (gamesWon < 0){
        System.out.println("Games Won must be greater or equal to 0\n");
        System.out.println("Enter the number of games you have played: ");
        gamesPlayed = userInput.nextDouble();
        System.out.println("Enter the number of games you have won: ");
        gamesWon = userInput.nextDouble();
      }
      else if (gamesPlayed <= 0){
        System.out.println("Total Games Played must be greater than 0\n");
        System.out.println("Enter the number of games you have played: ");
        gamesPlayed = userInput.nextDouble();
        System.out.println("Enter the number of games you have won: ");
        gamesWon = userInput.nextDouble();
      }
      else if (gamesWon > gamesPlayed){
        System.out.println("Games Won must be < Total Games Played\n");
        System.out.println("Enter the number of games you have played: ");
        gamesPlayed = userInput.nextDouble();
        System.out.println("Enter the number of games you have won: ");
        gamesWon = userInput.nextDouble();
      }
      else{
        inputsValid = true;
      }
    }

    double decimalGamesWon = gamesWon/gamesPlayed;
    double percentGamesWon = decimalGamesWon*100;

    DecimalFormat fmt = new DecimalFormat("#0.0");

    System.out.println("The percentage of games you have won is: "
    + fmt.format(percentGamesWon) + "%.");

  }
}
