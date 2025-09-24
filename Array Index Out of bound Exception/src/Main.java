public class Main {
    public static void main(String[] args) {
        try { //risky code should be in try part
            int a[] = new int[5];
            a[5] = a[10];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("This is the end of code:");
    }
}