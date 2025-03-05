package iuh.fit;

public class SeniorityDecorator extends EmployeeDecorator {
    private int yearsOfService;
    private static final double SENIORITY_RATE = 0.05; // 5% mỗi năm công tác

    public SeniorityDecorator(Employee employee, int yearsOfService) {
        super(employee);
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateSalary() {
        return employee.calculateSalary() + (basicSalary * SENIORITY_RATE * yearsOfService);
    }
} 