package iuh.fit;

public class DepartmentHeadDecorator extends EmployeeDecorator {
    private static final double DEPARTMENT_HEAD_ALLOWANCE = 5000000; // 5 triệu đồng

    public DepartmentHeadDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public double calculateSalary() {
        return employee.calculateSalary() + DEPARTMENT_HEAD_ALLOWANCE;
    }
} 