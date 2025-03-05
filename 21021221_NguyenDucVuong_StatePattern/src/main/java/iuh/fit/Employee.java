package iuh.fit;

import iuh.fit.states.EmployeeState;
import iuh.fit.states.NormalEmployeeState;

public class Employee {
    private String name;
    private EmployeeState state;

    public Employee(String name) {
        this.name = name;
        this.state = new NormalEmployeeState(); // Default state
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public double calculateSalary() {
        return state.calculateSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} 