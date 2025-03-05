package iuh.fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp = new BasicEmployee("Nguyễn Văn A", 1000);
        Employee seniority = new SeniorityDecorator(emp, 5);
        System.out.println(seniority.calculateSalary());

        Employee doctor = new DoctorDecorator(emp);
        System.out.println(doctor.calculateSalary());

        Employee departmentHead = new DepartmentHeadDecorator(emp);
        System.out.println(departmentHead.calculateSalary());

        Employee teamLeader = new TeamLeaderDecorator(emp);
        System.out.println(teamLeader.calculateSalary());
    }
}