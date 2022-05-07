import java.util.Objects;

public class Employee {
    private String FirstNameEmployee;
    private String MiddleNameEmployee;
    private String LastNameEmployee;
    private int numberDepartment;
    private double salaryEmployee;
    private int id;
    private static int counter = 1;

    public Employee(String firstNameEmployee, String middleNameEmployee, String lastNameEmployee, int numberDepartment, double salaryEmployee) {
        FirstNameEmployee = firstNameEmployee;
        MiddleNameEmployee = middleNameEmployee;
        LastNameEmployee = lastNameEmployee;
        this.numberDepartment = numberDepartment;
        this.salaryEmployee = salaryEmployee;
        this.id = counter++;
    }

    public String getFirstNameEmployee() {
        return FirstNameEmployee;
    }

    public String getMiddleNameEmployee() {
        return MiddleNameEmployee;
    }

    public String getLastNameEmployee() {
        return LastNameEmployee;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public static int getCounter() {
        return counter;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public String toString() {
        return this.FirstNameEmployee + "," + this.MiddleNameEmployee + "," + this.LastNameEmployee + "," + this.numberDepartment + "," + this.salaryEmployee + "," + this.id;
    }
}

