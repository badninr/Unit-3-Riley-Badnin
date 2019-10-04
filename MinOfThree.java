import java.util.Scanner;

public class MinOfThree {
  public static void main(String[] args){
    Scanner numInput = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int num1 = numInput.nextInt();
    System.out.println("Enter another integer: ");
    int num2 = numInput.nextInt();
    System.out.println("Enter another integer: ");
    int num3 = numInput.nextInt();

    if (num1<=num2 && num1<=num3){
      System.out.println("The minimum number is: "+num1);
    }
    else if (num2<=num1 && num2<=num3){
      System.out.println("The minimum number is: "+num2);
    }
    else if (num3<=num2 && num3<=num1){
      System.out.println("The minimum number is: "+num3);
    }

  }
}
