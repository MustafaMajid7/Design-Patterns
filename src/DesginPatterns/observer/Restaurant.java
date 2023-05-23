package DesginPatterns.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private List<Employee> staff = new ArrayList<>();
    private LocalDate ldt_of_salary;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant() {
        this.name = "UnKnown";
    }

    public void getEmployeed(Employee emp){
        staff.add(emp);
    }

    public void setSalaryDate(){
        for(Employee emp:staff) {
            emp.setLdt_of_salary(LocalDate.of(2023,5,14));
        }
    }

}
