package iuh.fit;

public class DoctorDecorator extends EmployeeDecorator {
    private static final double DOCTOR_ALLOWANCE = 2000000; // 2 triệu đồng

    public DoctorDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public double calculateSalary() {
        return employee.calculateSalary() + DOCTOR_ALLOWANCE;
    }
} 