package Kushnir.impl;

import Kushnir.service.Employee;

import java.util.List;

public class Boss implements Employee {
    int workingHourAmount;
    int hourlyRate;
    QA [] qas;
    List<SoftwareEngeneer> engeneers;
    List<Manager> managers;
    public static final double PERSENTAGE_FROM_QAS_SALARIES = 0.10;
    public static final double PERCENTAGE_FROM_SES_SALARIES = 0.15;
    public static final double PERCENTAGE_FROM_MANAGER_SALARIES = 0.20;
    public static final String TYPE = "Boss";
    @Override
    public String getType() {
        return TYPE;
    }
    @Override
    public int getSalary() {
        int salaryByHours = workingHourAmount * hourlyRate;
        int salaryFromQAs = 0;
        int salaryFromSEs = 0;
        int salaryFromManager = 0;
        for (int i =0; i < qas.length; ++i) {
            salaryFromQAs += qas[i].getSalary();
        }
        salaryFromQAs = (int) (salaryFromQAs * PERSENTAGE_FROM_QAS_SALARIES);
        for (SoftwareEngeneer se:engeneers) {
            salaryFromSEs += se.getSalary();
        }
        salaryFromSEs = (int) (salaryFromSEs * PERCENTAGE_FROM_SES_SALARIES);
        for(Manager se:managers) {
            salaryFromManager += se.getSalary();
        }
        return salaryByHours + salaryFromQAs + salaryFromSEs + salaryFromManager;
    }

    public Boss (int hourlyRate, int workingHourAmount, QA[] qas, List<SoftwareEngeneer> engeneers, List<Manager> managers) {
        this.hourlyRate = hourlyRate;
        this.workingHourAmount = workingHourAmount;
        this.qas = qas;
        this.engeneers = engeneers;
        this.managers = managers;
    }
}


