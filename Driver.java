package EmployeeHierarchy;

public class Driver {
    public static void main(String[] args) {
       Employee rei = new CommissionEmployee
                ("Rei", "Yoshizawa", "112233");

        System.out.println(rei.getFirstName());
        System.out.println(rei.getLastName());
        System.out.println(rei.getSocialSecurityNumber());
    }
}
