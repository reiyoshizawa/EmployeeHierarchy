package EmployeeHierarchy;

// Fig. 9.5: CommissionEmployeeTest.java
// CommissionEmployee class test program.
public class CommissionEmployeeTest {
    public static void main(String[] args) {
    // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones",
                "222-22-2222", 10000,
                .06);
    // get commission employee data
    System.out.println(
    "Employee information obtained by get methods:");
    System.out.printf("%n%s %s%n", "First name is");
    System.out.printf("%s %s%n", "Last name is");
    System.out.printf("%s %s%n", "Social security number is");
    System.out.printf("%s %.2f%n", "Gross sales is");
    System.out.printf("%s %.2f%n", "Commission rate is");
    System.out.printf("%n%s:%n%n %n",
    "Updated employee information obtained by toString");
    } // end main

} // end class CommissionEmployeeTest
