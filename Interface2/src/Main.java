interface I2 {
    public abstract void show();

    public static final int a = 10;

    default void display() {
        if (a > 5) {
            System.out.println("The value of 'a' is greater than 5. Running display method...");
        } else {
            System.out.println("The value of 'a' is less than or equal to 5. Running display method...");
        }
    }

    public static void run() {
        int b = 15;
        if (b == a) {
            System.out.println("The value of 'a' and 'b' are equal. Running display method...");
        } else if (b > a) {
            System.out.println("The value of 'b' is greater than 'a'. Running display method...");
        } else {
            System.out.println("The value of 'b' is less than 'a'. Running display method...");
        }
    }

    private void get() {
        int c = 8;
        if (c % 2 == 0) {
            System.out.println("The value of 'c' is even. Running display method...");
        } else {
            System.out.println("The value of 'c' is odd. Get method won't proceed");
        }
    }
}
class Test implements I2 {
    public void show() {
        int x = 20;
        if (x > a) {
            System.out.println("The value of 'x' is greater than 'a'. Running display method...");
        } else {
            System.out.println("The value of 'x' is less than or equal to 'a'. Running display method...");
        }
    }
}
public class Main {
    public static void main (String[] args) {
        Test t = new Test ();
        t.display();
        t.show();
        I2.run();
    }
}