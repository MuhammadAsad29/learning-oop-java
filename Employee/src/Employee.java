abstract class Employee {
    String name;
    String employeeId;
    Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    abstract void salary();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }
    void salary() {
        System.out.println("The salary is the monthly salary: " + monthlySalary);
    }
    void displayDetails() {
        System.out.println("Full-Time Employee: " + name + "\nID: " + employeeId);
        salary();
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    void salary() {
        System.out.println("The salary is: " + hourlyRate * hoursWorked);
    }
    void displayDetails() {
        System.out.println("Part-Time Employee: " + name + "\nID: " + employeeId);
        salary();
    }
}
class Contractor extends Employee {
    double contractAmount;
    int contractDuration;
    Contractor(String name, String employeeId, double contractAmount, int contractDuration) {
        super(name, employeeId);
        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
    }
    void salary() {
        System.out.println("The salary is: " + contractAmount / contractDuration);
    }
    void displayDetails() {
        System.out.println("Contractor: " + name + "\nID: " + employeeId);
        salary();
    }
}
class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Ali", "FT123", 345000);
        fullTimeEmployee.displayDetails();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Babar", "PT456", 3500, 20);
        partTimeEmployee.displayDetails();

        Contractor contractor = new Contractor("Hasan", "CT789", 3600000, 16);
        contractor.displayDetails();
    }
}