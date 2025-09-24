public class Addition {
    int add(int a, int b) {
        return (a + b);
    }
    int add(int a, int b, int c) {
        return (a + b + c);
    }
    public static void main(String[] args) {
        Addition A1 = new Addition();
        System.out.println(A1.add(2, 3));
        System.out.println(A1.add(3,3, 3));
    }
}