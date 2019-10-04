import java.util.Scanner;

public class TempReader{
  public static void main(String[] args){
    Scanner tempInput = new Scanner(System.in);
    System.out.println("Enter the temperature");
    int temp = tempInput.nextInt();

    if (temp>83){
      System.out.println("Hot");
    }
    else if (68<=temp && temp<=83){
      System.out.println("Ideal");
    }
    else if (45<=temp && temp<=67){
      System.out.println("Cool");
    }
    else{
      System.out.println("Cold");
    }
  }
}
