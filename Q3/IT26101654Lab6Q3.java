import java.util.Scanner;

public class IT26101654Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        double sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        while (num != -99) {
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares = sumOfSquares + (num * num);
                count++;
            }
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        System.out.println();
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

    }
}
