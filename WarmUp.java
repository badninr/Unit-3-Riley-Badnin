import java.util.Scanner;

public class WarmUp{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String input = scan.nextLine();

    for (int i = 0; i <= input.length()-1 ; i++){
      System.out.println(input.charAt(i));
    }
  }
}
