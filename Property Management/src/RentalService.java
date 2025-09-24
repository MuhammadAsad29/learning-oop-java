package propertyManagement;

import java.util.Scanner;

public interface Property {
    double calculateRental(int months);
    String getPropertyType();
}
public class Apartment implements Property {
    private static final double RENTAL_COST_PER_MONTH = 1000.0;

    public double calculateRental(int months) {
        return RENTAL_COST_PER_MONTH * months;
    }

    public String getPropertyType() {
        return "Apartment";
    }
}
public class House implements Property {
    private static final double RENTAL_COST_PER_MONTH = 1500.0;

    public double calculateRental(int months) {
        return RENTAL_COST_PER_MONTH * months;
    }

    public String getPropertyType() {
        return "House";
    }
}
public class Office implements Property {
    private static final double RENTAL_COST_PER_MONTH = 2500.0;

    public double calculateRental(int months) {
        return RENTAL_COST_PER_MONTH * months;
    }

    public String getPropertyType() {
        return "Office";
    }
}
import java.util.Scanner;

public class RentalService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of months the property is rented: ");
        int months = scanner.nextInt();

        Property[] properties = {
                new Apartment(),
                new House(),
                new Office()
        };

        for (Property property : properties) {
            System.out.println("Property Type: " + property.getPropertyType());
            System.out.println("Total Rental Cost for " + months + " months: $" + property.calculateRental(months));
            System.out.println();
        }

        scanner.close();
    }
}