package iuh.fit.states;

public class NormalEmployeeState implements EmployeeState {
    private static final double BASE_SALARY = 5000000; // Lương cơ bản

    @Override
    public double calculateSalary() {
        return BASE_SALARY;
    }
} 