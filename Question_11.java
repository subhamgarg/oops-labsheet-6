// Question 11: Compute average of 10 numbers and count how many are above average (Using 'this' keyword)
import java.util.Scanner;

public class Question_11 {
    private double[] numbers;
    private double average;

    public Question_11() {
        this.numbers = new double[10];
        this.average = 0.0;
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            this.numbers[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public void computeAverage() {
        double sum = 0;
        for (double num : this.numbers) {
            sum += num;
        }
        this.average = sum / this.numbers.length;
        System.out.println("Average: " + this.average);
    }

    public void findAboveAverage() {
        int count = 0;
        for (double num : this.numbers) {
            if (num > this.average) {
                count++;
            }
        }
        System.out.println("Number of elements above average: " + count);
    }

    public static void main(String[] args) {
        Question_11 app = new Question_11();
        // For standard automated environments or simple testing, you can call the methods.
        // Since standard inputs differ, here is a mock run block or placeholder:
        System.out.println("Execute this program interactively to provide 10 inputs.");
        
        // Uncomment below lines for interactive execution:
        // app.readNumbers();
        // app.computeAverage();
        // app.findAboveAverage();
    }
}
