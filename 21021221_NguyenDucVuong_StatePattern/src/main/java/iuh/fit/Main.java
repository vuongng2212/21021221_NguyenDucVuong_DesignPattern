package iuh.fit;

import iuh.fit.states.DeanState;
import iuh.fit.states.DoctorState;
import iuh.fit.states.NormalEmployeeState;
import iuh.fit.states.TeamLeaderState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyen Van A");
        emp.setState(new DoctorState());
        System.out.println(emp.calculateSalary());

        emp.setState(new NormalEmployeeState());
        System.out.println(emp.calculateSalary());

        emp.setState(new DeanState());
        System.out.println(emp.calculateSalary());

        emp.setState(new TeamLeaderState());
        System.out.println(emp.calculateSalary());
    }
}