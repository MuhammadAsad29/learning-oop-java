public class Arith_Excep {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 0;
        try { //risky code should be in try part
            c = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.printf("This is the end of code:");
    }
}