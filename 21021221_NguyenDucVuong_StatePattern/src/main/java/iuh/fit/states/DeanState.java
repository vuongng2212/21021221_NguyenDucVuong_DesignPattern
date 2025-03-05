package iuh.fit.states;

public class DeanState implements EmployeeState {
    private static final double BASE_SALARY = 5000000; // Lương cơ bản
    private static final double DEAN_ALLOWANCE = 3000000; // Phụ cấp Trưởng khoa

    @Override
    public double calculateSalary() {
        return BASE_SALARY + DEAN_ALLOWANCE;
    }
} 