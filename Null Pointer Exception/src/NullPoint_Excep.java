public class NullPoint_Excep {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 0;
        try { //risky code should be in try part
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.printf("This is the end of code:");
    }
}