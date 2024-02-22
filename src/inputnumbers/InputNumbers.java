import java.util.Scanner;

public class InputNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of integers to input:");
    int numInts = scanner.nextInt();
    int[] numbers = new int[numInts];
    System.out.println("Enter " + numInts + " integers:");
    for (int i = 0; i < numInts; i++) {
      numbers[i] = scanner.nextInt();
    }
    System.out.println("The input numbers are:");
    for (int i = 0; i < numInts; i++) {
      System.out.println((i + 1) + ". " + numbers[i]);
    }
  }
}