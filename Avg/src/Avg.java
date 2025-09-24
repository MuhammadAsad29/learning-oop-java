import java.util.Scanner;

public class Avg {

    public static void main(String[] args) {
        float num1;
        float num2;
        float average;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter any number:");
        float nextFloat = myObj.nextFloat();
        System.out.println("Your number 1 is: ");
        num1 = myObj.nextFloat();
        System.out.println("Your number 2 is: ");
        num2 = myObj.nextFloat();

        average = (float) (num1 + num2) / 2;
        System.out.println("Average value: " + average);
        average = nextFloat;
    }
}