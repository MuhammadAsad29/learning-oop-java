class test {

    void show(int a, float b) {
        sum = a + b;
        System.out.println("sum:" + 10);
    }
    void show(int a) {
        System.out.println("a:" + a);
    }
    public static void main() {
        test t = new test();
        t.show(10, 20);
    }
}