package EmployeeHierarchy;

public class HourlyEmployee extends Employee{

    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (0 < hours && hours < 168) {
            this.hours = hours;
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 0){
            this.wage = wage;
        }
    }

    public double earnings() {
        return hours * wage;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
