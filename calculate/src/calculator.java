class calculator{
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a * b + c;
    }
    double add(double a, double b) {
        return a % b;
    }
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Sum of two integars: " + calc.add(10,20));
        System.out.println("Sum of three integars: " + calc.add(19,71, 30));
        System.out.println("Sum of two doubles: " + calc.add(1000000000.5, 209876655444.5));
    }
}