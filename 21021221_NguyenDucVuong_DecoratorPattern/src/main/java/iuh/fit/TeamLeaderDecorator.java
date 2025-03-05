package iuh.fit;

public class TeamLeaderDecorator extends EmployeeDecorator {
    private static final double TEAM_LEADER_ALLOWANCE = 1000000; // 1 triệu đồng

    public TeamLeaderDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public double calculateSalary() {
        return employee.calculateSalary() + TEAM_LEADER_ALLOWANCE;
    }
} 