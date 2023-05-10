package Kushnir.impl;

import Kushnir.service.Employee;

public class SoftwareEngeneer implements Employee {
    int workingHourAmount;
    int hourlyRate;
    public static final String TYPE = "Software Engineer";
    @Override
    public String getType() {
        return TYPE;
    }
    @Override
    public int getSalary() {

        return workingHourAmount * hourlyRate;
    }

    public SoftwareEngeneer (int hourlyRate, int workingHourAmount) {
        this.hourlyRate = hourlyRate;
        this.workingHourAmount = workingHourAmount;
    }
}
