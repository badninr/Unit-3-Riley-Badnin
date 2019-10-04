import java.util.Scanner;

public class DrinkingAge {
  public static void main (String[] args) {
    Scanner ageInput = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = ageInput.nextInt();

    if (age>=21){
      System.out.println("You are of the legal drinking age");
    }
    else{
      System.out.println("You are not of the legal drinking age");
    }
  }
}
