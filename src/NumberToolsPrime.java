/**
 * Durham College - Computer Programming and Analysis
 * COSC 1200 Object-Oriented Programming 1
 * Prof. Ken Hodgson
 * Daniel Doro Leao | SID: 101042176
 * Date: 2026-02-27
 * Activity Name: Class Exercise 3: Numeric Functions
 */

void main() {
  Scanner scanner = new Scanner(System.in);
  while (true) {
    IO.print("Please enter an Integer Number to test (or a anything else to exit): ");
    if (!scanner.hasNextInt()) {
      IO.println("Exiting program. See ya!");
      break;
    }
    int number = scanner.nextInt();
    IO.println("Is " + number + " an even number? " + (NumberTools.isEven(number) ? "Yes." : "No."));
    IO.println("Is " + number + " a positive number? " + (NumberTools.isPositive(number) ? "Yes." : "No."));
    IO.println("Is " + number + " a Fibonacci number? " + (NumberTools.isFibonacci(number) ? "Yes." : "No."));
    IO.println("Is " + number + " a power of two? " + (NumberTools.isPowerOfTwo(number) ? "Yes." : "No."));
    IO.println("Is " + number + " a prime number? " + (NumberTools.isPrime(number) ? "Yes." : "No."));
    IO.println("Is " + number + " a square number? " + (NumberTools.isSquare(number) ? "Yes." : "No."));
    IO.println();
  }
  scanner.close();
}
