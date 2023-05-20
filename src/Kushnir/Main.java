package Kushnir;

import Kushnir.impl.Boss;
import Kushnir.impl.Manager;
import Kushnir.impl.QA;
import Kushnir.impl.SoftwareEngeneer;
import Kushnir.service.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Kushnir.Lesson12.factorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("factorial: " + factorial(5));

        List<Employee> employees = createEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getType() + " salary: " + employee.getSalary() + " $");
        }
    }
    public static List<Employee> createEmployees() {
        Scanner scanner = new Scanner(System.in);
        QA[] qas = new QA[3];
        for (int i = 0; i < qas.length; i++) {
            System.out.print("ВВедіть погодинну ставку для QA " + (i + 1) + ": ");
            int hourlyRate = scanner.nextInt();
            System.out.print("Введіть кількість робочих годин для QA " + (i + 1) + ": ");
            int workingHourAmount = scanner.nextInt();
            qas[i] = new QA(hourlyRate, workingHourAmount);

        }
        List<SoftwareEngeneer> ses = new ArrayList<>();
        System.out.print("Введіть кількість Software Engineer : ");
        int numOfSEs = scanner.nextInt();
        for (int i = 0; i < numOfSEs; i++) {
            System.out.print("ВВедіть погодинну ставку для Software Engineer " + (i + 1) + ": ");
            int hourlyRate = scanner.nextInt();
            System.out.print("Введіть кількість робочих годин для Software Engineer " + (i + 1) + ": ");
            int workingHourAmount = scanner.nextInt();
            ses.add(new SoftwareEngeneer(hourlyRate, workingHourAmount));
        }

        Manager manager1 = new Manager(10, 45, qas, ses);
        List<Manager> managers = new ArrayList<>();
        managers.add(manager1);

        Boss boss = new Boss(10, 45, qas, ses, managers);

        List<Employee> employees = new ArrayList<>();
        employees.add(qas[0]);
        employees.add(qas[1]);
        employees.add(qas[2]);
        employees.addAll(ses);
        employees.add(manager1);
        employees.add(boss);

        return employees;

        }
    }

