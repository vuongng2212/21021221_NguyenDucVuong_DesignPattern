package iuh.fit.states;

public class TeamLeaderState implements EmployeeState {
    private static final double BASE_SALARY = 5000000; // Lương cơ bản
    private static final double TEAM_LEADER_ALLOWANCE = 1500000; // Phụ cấp Tổ trưởng

    @Override
    public double calculateSalary() {
        return BASE_SALARY + TEAM_LEADER_ALLOWANCE;
    }
} 