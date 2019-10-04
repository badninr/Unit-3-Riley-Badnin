import java.util.Scanner;

public class AgeCheck {
  public static void main (String[] args){
    Scanner ageInput = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = ageInput.nextInt();

    if (age>=21){
      System.out.println("You are able to both drink and drive.");
    }
    else if (age>=17){
      System.out.println("You cannot drink, but you can drive.");
    }
    else{
      System.out.println("You can't drink nor drive.");
    }
  }
}
