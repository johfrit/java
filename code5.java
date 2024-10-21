import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int reversed = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            number /= 10;  // Remove the last digit
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
