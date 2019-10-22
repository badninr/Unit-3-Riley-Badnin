import java.util.Scanner;

public class PalindromeTester{
  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);

    //--------------------------------------------------------------------------
    System.out.println("Would you like to enter a palindrome? Type y or n.");
    String likeToPlay = ask.next();
    //-------------------------------------------------------------------------

    while (likeToPlay.equals("y")){
      Scanner palInput = new Scanner(System.in);
      System.out.println("Enter a palindrome:");
      String palInputString = palInput.nextLine();
      String palindrome = palInputString.toLowerCase();
      String reversePal = "";
      //-----------------------------------------------------------------------
      for(int i = palindrome.length()-1; i>=0; i--){
        reversePal = reversePal + palindrome.charAt(i);
      }
      //-----------------------------------------------------------------------
      if (palindrome.equals(reversePal)){
        System.out.println("This is a palindrome.");
      }
      else{
        System.out.println("This is not a palindrome.");
      }
      //-----------------------------------------------------------------------
      System.out.println("Would you like to enter another palindrome? Type y or n.");
      likeToPlay = ask.next();
    }

    //--------------------------------------------------------------------------
    System.out.println("Okay then. Bye.");
    //--------------------------------------------------------------------------
  }
}
