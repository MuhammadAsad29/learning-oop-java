interface I1 {
    public abstract void show();
    public static final int a = 10;
    default void display() {
        System.out.println("Hi this is display method run");
    }
    public static void run() {
        System.out.println("Hi this is display Run method run");
    }
    private void get() {
        System.out.println("Hi this is get method run");
    }
}
public class Teacher implements I1 {
    public void show () {
        System.out.println("Hi this is show method run");
    }
    public static void main(String[] args) {
        Teacher t1 =new Teacher();
        t1.show();
        t1.display();
        I1.run();
    }
}