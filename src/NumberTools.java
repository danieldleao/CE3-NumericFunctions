/**
 * Durham College - Computer Programming and Analysis
 * COSC 1200 Object-Oriented Programming 1
 * Prof. Ken Hodgson
 * Daniel Doro Leao | SID: 101042176
 * Date: 2026-02-27
 * Activity Name: Class Exercise 3: Numeric Functions
 */

public class NumberTools {
  // Is evenly divisible by 2
  public static boolean isEven(int value) {
    return value % 2 == 0;
  }
  // If value is positive
  public static boolean isPositive(int value) {
    return value > 0;
  }
  // If value is in the Fibonacci sequence
  public static boolean isFibonacci(int value) {
    if (value < 0) return false;
    int a = 0, b = 1;
    while (a < value) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    return a == value;
  }
  // If value is a power of two
  public static boolean isPowerOfTwo(int value) {
    if (value <= 0) return false;
    return (value & (value - 1)) == 0;
  }
  // If value is a prime number
  public static boolean isPrime(int value) {
    if (value < 2) return false;
    for (int i = 2; i <= Math.sqrt(value); i++) {
      if (value % i == 0) return false;
    }
    return true;
  }
  // If value is a perfect square
  public static boolean isSquare(int value) {
    if (value < 0) return false;
    int sqrt = (int) Math.sqrt(value);
    return sqrt * sqrt == value;
  }
}
