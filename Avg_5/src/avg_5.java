import java.util.Scanner;
public class avg_5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int average;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter any number:");
        System.out.print("Your number 1 is: ");
        num1 = myObj.nextInt();
        System.out.print("Your number 2 is: ");
        num2 = myObj.nextInt();
        System.out.print("Your number 3 is: ");
        num3 = myObj.nextInt();
        System.out.print("Your number 4 is: ");
        num4 = myObj.nextInt();
        System.out.print("Your number 5 is: ");
        num5 = myObj.nextInt();
        average = (int) (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.print("Average value: " + average);
        average = myObj.nextInt();
        if (average >= 50) {
            System.out.print("You are passed:" + average);
        } else {
            System.out.print("You are failed:" + average);
        }
    }
}
