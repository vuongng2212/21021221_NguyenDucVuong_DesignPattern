package iuh.fit;

public abstract class EmployeeDecorator extends Employee {
    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        super(employee.name, employee.basicSalary);
        this.employee = employee;
    }

    @Override
    public double calculateSalary() {
        return employee.calculateSalary();
    }
} 