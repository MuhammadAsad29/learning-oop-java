class car{
    String model;
    int year;
    String make;
    double price;
    int used;
    float depriciation;

    car(String model, int year, String make, double price, int used, float depriciation) {
        this.model = model;
        this.year = year;
        this.make = make;
        this.price = price;
        this.used = used;
        this.depriciation = depriciation;
    }
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Make: " + make);
        System.out.println("Price: " + price);
        System.out.println("Used: " + used);
        System.out.println("Depreciation: " + depriciation);
    }
    public static void main(String[] args) {
        car mycar = new car("Corrolla Model", 2017, "Toyota", 15560000, 7, 15000000);
        mycar.displayDetails();
    }
}