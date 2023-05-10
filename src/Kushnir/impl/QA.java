package Kushnir.impl;

import Kushnir.service.Employee;

public class QA implements Employee {
    int workingHourAmount;
    int hourlyRate;
    public static final String TYPE = "QA";
    @Override
    public String getType() {
        return TYPE;
    }
    @Override
    public int getSalary() {

        return workingHourAmount * hourlyRate;
    }

    public QA (int hourlyRate, int workingHourAmount) {
        this.hourlyRate = hourlyRate;
        this.workingHourAmount = workingHourAmount;
    }
}
