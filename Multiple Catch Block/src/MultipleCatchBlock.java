public class MultipleCatchBlock {
    public static void main(String[] args) {
        try { //risky code should be in try part
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithematic Exception Occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Occurs");
        }
        catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.printf("This is the end of code:");
    }
}