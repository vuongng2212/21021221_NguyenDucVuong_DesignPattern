package iuh.fit;

public class BasicEmployee extends Employee {
    public BasicEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary;
    }
} 