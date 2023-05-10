package Kushnir;


import Kushnir.impl.Boss;
import Kushnir.impl.Manager;
import Kushnir.impl.QA;
import Kushnir.impl.SoftwareEngeneer;
import Kushnir.service.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = createEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getType() + " salary: " + employee.getSalary() + " $");
        }
    }
    public static List<Employee> createEmployees() {
        QA qa1 = new QA(10, 45);
        QA qa2 = new QA(10, 45);

        SoftwareEngeneer se1 = new SoftwareEngeneer(10, 45);
        SoftwareEngeneer se2 = new SoftwareEngeneer(10, 45);

        QA[] qas = new QA[]{qa1, qa2};
        List<SoftwareEngeneer> ses = new ArrayList<>();
        ses.add(se1);
        ses.add(se2);

        Manager manager1 = new Manager(10, 45, qas, ses);
        List<Manager> managers = new ArrayList<>();
        managers.add(manager1);

        Boss boss = new Boss(10, 45, qas, ses, managers);

        List<Employee> employees = new ArrayList<>();
        employees.add(qa1);
        employees.add(qa2);
        employees.add(se1);
        employees.add(se1);
        employees.add(manager1);
        employees.add(boss);

        return employees;

    }
}