import java.util.Scanner;
class YoungerAgeException extends RuntimeException { //Customized Exception
    YoungerAgeException(String msg) {
        super(msg);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int age = sc.nextInt();
        try {
            if(age<18) {
                throw new YoungerAgeException("You are not eligible for voting...");
            } else {
                System.out.println("You can vote successfully");
            }
        }
        catch (YoungerAgeException e) {
            e.printStackTrace();
        }
        System.out.println("Hi this is Me!!");
    }
}