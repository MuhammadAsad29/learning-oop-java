class overloadingDetails {
    String add(String name, String d_o_b) {
        return name + d_o_b;
    }
    String add(String name, String d_o_b, int roll_no) {
        return name + d_o_b  + roll_no;
    }
    double add(double ph_no, double roll_no) {
        return ph_no + roll_no;
    }
    void displayDetails() {
        System.out.println("Concatenate of two Strings: " + add("Muhammad Asad", ", 29 July"));
        System.out.println("Concatenate of three Strings: " + add("Muhammad Asad", ", 29 July, ", 64556));
        System.out.println("Concatenate of two doubles: " + add("912345678", " + 64556"));
    }
    public static void main(String[] args) {
        overloadingDetails details = new overloadingDetails();
        details.displayDetails();
    }
}