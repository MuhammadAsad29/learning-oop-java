class bike{
    String model;
    int year;
    String engine;
    String company;

    bike(String model, int year, String engine, String company) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.company = company;
    }
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine: " + engine);
        System.out.println("Company: " + company);
    }
    public static void main(String[] args) {
        bike mybike = new bike("70 Model", 2024, "70cc engine", "Honda");
        mybike.displayDetails();
    }
}