class calculator{
    float add(int a, int b){
        float sum = a + b;
        return sum;
    }
    public static void main(String [] args) {
        calculator calc = new calculator();
        float result = calc.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}