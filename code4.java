import java.util.Scanner;
public class Amstrong_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;

         while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit; 
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
