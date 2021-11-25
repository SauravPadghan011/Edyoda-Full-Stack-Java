package edyoda.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Employee {
    int empId;
    float salary;
//    Date dob;
//    Date dateOfJoining;
    String name;

//    Date dob, Date dateOfJoining,
    Employee(int empId, float salary, String name) {
        this.empId = empId;
        this.salary = salary;
//        this.dob = dob;
//        this.dateOfJoining = dateOfJoining;
        this.name = name;
    }

    public void print() {
        System.out.println(this.name + " " +  this.empId + " " + this.salary);
    }

//    public String getName() {
//        return this.name;
//    }
//
//    public float getSalary() {
//        return this.
//    }
}

public class Department {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,4200,"Saurav"));
        employees.add(new Employee(2,2200,"Amit"));
        employees.add(new Employee(3,3500,"Umesh"));
        employees.add(new Employee(4,1600,"Trupti"));

        System.out.println();



    }
}
