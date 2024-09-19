import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        int count = 0;
        double sum = 0;
        double input;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter up to 15 double values (enter 99999 to quit):");

        // Input values
        while (count < 15) {
            input = sc.nextDouble();
            if (input == 99999) {
                break;
            }
            numbers[count] = input;
            sum += input;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No numbers entered.");
        } else {
            double average = sum / count;
            System.out.println("Count of numbers entered: " + count);
            System.out.println("Average: " + average);

            for (int i = 0; i < count; i++) {
                double distance = numbers[i] - average;
                System.out.printf("Value: %.2f, Distance from average: %.2f\n", numbers[i], distance);
            }
        }
    }
}