import java.sql.SQLOutput;
import java.util.Scanner;

public class findAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        int avg = (num1 + num2)/2;

        System.out.println("The average of your two number is " + avg);
    }
}
