// The task is to write a program with three methods named printChar. The first method takes
// no arguments and prints 45 asterisks (*) in a single line. The second method takes
// a character as an argument and prints that character 45 times. The third method takes
// a character and a number as arguments and prints the specified number of copies of the
// specified character."

public class Print_char {

    public static void print_asterisks() {
        print_chars('*', 45);
    }

    public static void print_chars(char c) {
        print_chars(c, 45);
    }

    public static void print_chars(char c, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print_asterisks(); // First method call
        print_chars('#'); // Second method call
        print_chars('@', 10); // Third method call
    }
}
