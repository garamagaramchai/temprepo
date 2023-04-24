import java.util.ArrayList;
import java.util.Scanner;

class OverflowException extends Exception {
    public OverflowException(String errorMessage) {
        super(errorMessage);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[10];
        int count = 0;
        try {
            while (count < arr.length) {
                System.out.print("Enter a number: ");
                arr[count] = input.nextInt();
                count++;
                if (count >= arr.length / 2 && count < arr.length) {
                    throw new OverflowException("Array has reached half of its final size.");
                }
            }
        } catch (OverflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
