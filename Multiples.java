import java.util.Scanner;

public class Multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("What number do you want the multiples of?");
    int num = scan.nextInt();
    System.out.println("What do you want the limit to be?");
    int limit = scan.nextInt();

    boolean valuesGood = false;
    while (valuesGood == false){
      if (num <= 0 || limit < 1){
        System.out.println("Inputs must be positive numbers.");
        System.out.println("What number do you want the multiples of?");
        num = scan.nextInt();
        System.out.println("What do you want the limit to be?");
        limit = scan.nextInt();
      }
      else if (limit < num){
        System.out.println("Your limit must be larger than your number");
        System.out.println("What number do you want the multiples of?");
        num = scan.nextInt();
        System.out.println("What do you want the limit to be?");
        limit = scan.nextInt();
      }
      else{
        valuesGood = true;
      }
    }

    final int LINELIMIT = 5;
    int lineCount = 0;
    System.out.println("\n");
    System.out.println("The multiples of " + num + " up to " + limit + " are:");
    for (int i = 1; (i*num) <= limit; i++){
      if ((lineCount % LINELIMIT) == 0 && i!=1){
        System.out.print("\n");
      }
      System.out.print(i*num + " ");
      lineCount++;
    }
    System.out.println(" ");

  }
}
