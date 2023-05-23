package DesginPatterns.observer;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private LocalDate ldt_of_salary;
    private Period period ;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLdt_of_salary(LocalDate ldt_of_salary) {
        this.ldt_of_salary = ldt_of_salary;
    }

    public String getSalaryDate(){
        period = Period.between(ldt_of_salary,LocalDate.now());
        return "The time from now to the last Salary Date is : " + period.getDays() ;
    }
}
