package EmployeeHierarchy;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        // instantiate CommissionEmployee object
        HourlyEmployee rei = new HourlyEmployee(
                "Rei", "Yoshizawa",
                "112233", 40.5, 12.5);
        // get commission employee data
        System.out.println(
                "Employee information obtained by get methods:");
        System.out.println("First name is " + rei.getFirstName());
        System.out.println("Last name is " + rei.getLastName());
        System.out.println("Social security number is " + rei.getSocialSecurityNumber());
        System.out.println("The number of hours worked " + rei.getHours() + "h");
        System.out.println("An hourly wage is $" + rei.getWage());
        System.out.println("Weekly earnings is $" + rei.earnings());
        System.out.println("Updated employee information obtained by toString");

    } // end main
}
