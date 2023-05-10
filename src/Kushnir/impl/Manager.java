package Kushnir.impl;

import Kushnir.service.Employee;

import java.util.List;

public class Manager implements Employee {
    int workingHourAmount;
    int hourlyRate;
    QA [] qas;
       List<SoftwareEngeneer> engeneers;
    public static final double PERSENTAGE_FROM_QAS_SALARIES = 0.10;
    public static final double PERCENTAGE_FROM_SES_SALARIES = 0.15;
    public static final String TYPE = "Manager";
    @Override
    public String getType() {
        return TYPE;
    }
    @Override
    public int getSalary() {
        int salaryByHours = workingHourAmount * hourlyRate;
        int salaryFromQAs = 0;
        int salaryFromSEs = 0;
        for (int i =0; i < qas.length; ++i) {
            salaryFromQAs += qas[i].getSalary();
        }
        salaryFromQAs = (int) (salaryFromQAs * PERSENTAGE_FROM_QAS_SALARIES);
        for (SoftwareEngeneer se:engeneers) {
            salaryFromSEs += se.getSalary();
        }
        salaryFromSEs = (int) (salaryFromSEs * PERCENTAGE_FROM_SES_SALARIES);
        return salaryByHours + salaryFromQAs + salaryFromSEs;
    }

    public Manager (int hourlyRate, int workingHourAmount, QA[] qas, List<SoftwareEngeneer> engeneers) {
        this.hourlyRate = hourlyRate;
        this.workingHourAmount = workingHourAmount;
        this.qas = qas;
        this.engeneers = engeneers;
    }
}
