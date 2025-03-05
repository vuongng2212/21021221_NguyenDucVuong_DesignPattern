package iuh.fit.states;

public class DoctorState implements EmployeeState {
    private static final double BASE_SALARY = 5000000; // Lương cơ bản
    private static final double DOCTOR_SUB = 2000000; // Phụ cấp Tiến sĩ

    @Override
    public double calculateSalary() {
        return BASE_SALARY + DOCTOR_SUB;
    }
} 