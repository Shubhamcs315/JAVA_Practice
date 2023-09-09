import java.util.Scanner;

public class EncapsulationEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Emp employee = new Emp();
        //id
        System.out.print("Enter Employee ID: ");
        employee.setEmployeeId(scanner.nextInt());
        
        scanner.nextLine();
        //name
        System.out.print("Enter Employee Name: ");
        employee.setEmployeeName(scanner.nextLine());
        //salary
        System.out.print("Enter Employee Salary: ");
        employee.setEmployeeSalary(scanner.nextDouble());

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());

        scanner.close();
    }
}
class Emp{
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    
    //id
    public int getEmployeeId() {
        return employee_id;
    }
    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    //name
    public String getEmployeeName() {
        return employee_name;
    }
    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    //salary
    public double getEmployeeSalary() {
        return employee_salary;
    }
    public void setEmployeeSalary(double salary) {
        this.employee_salary = salary;
    }
}