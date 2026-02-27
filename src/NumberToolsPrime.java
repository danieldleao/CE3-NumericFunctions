/**
 * Durham College - Computer Programming and Analysis
 * COSC 1200 Object-Oriented Programming 1
 * Prof. Ken Hodgson
 * Daniel Doro Leao | SID: 101042176
 * Date: 2026-02-27
 * Activity Name: Class Exercise 3: Numeric Functions
 */

import java.util.Scanner;

public class NumberToolsPrime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Please enter an Integer Number to test (or a anything else to exit): ");
      if (!scanner.hasNextInt()) {
        System.out.println("Exiting program. See ya!");
        break;
      }
      int number = scanner.nextInt();
      System.out.println("Is " + number + " an even number? "      + (NumberTools.isEven(number)      ? "Yes." : "No."));
      System.out.println("Is " + number + " a positive number? "   + (NumberTools.isPositive(number)  ? "Yes." : "No."));
      System.out.println("Is " + number + " a Fibonacci number? "  + (NumberTools.isFibonacci(number) ? "Yes." : "No."));
      System.out.println("Is " + number + " a power of two? "      + (NumberTools.isPowerOfTwo(number)? "Yes." : "No."));
      System.out.println("Is " + number + " a prime number? "      + (NumberTools.isPrime(number)     ? "Yes." : "No."));
      System.out.println("Is " + number + " a square number? "     + (NumberTools.isSquare(number)    ? "Yes." : "No."));
      System.out.println();
    }
    scanner.close();
  }
}