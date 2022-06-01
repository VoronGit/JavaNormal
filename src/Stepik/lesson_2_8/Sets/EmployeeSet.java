package Stepik.lesson_2_8.Sets;

import Stepik.lesson_2_8.Entities.Employee.Employee;

import java.util.LinkedHashSet;

public class EmployeeSet extends LinkedHashSet<Employee> {

    public void addEmployee(Employee employee) {
        super.add(employee);
    }

    public void removeEmployee(Employee employee) {
        super.remove(employee);
    }

    public String getEmployeeList() {
        StringBuilder str = new StringBuilder();
        int empNum = 1;
        if (super.size() == 0) return "";
        for (Employee employee : super.toArray(new Employee[0])) {
            str.append(empNum++);
            str.append(". ");
            str.append(employee.toString());
            if (empNum<=super.size()) {
                str.append(";\n");
            } else {
                str.append(".");
            }
        }
        return str.toString();
    }

    public Employee getEmployeeByNumber(int number) throws Exception{
        if (number == 0 || number > super.size()) throw new Exception("No such book in the list");
        Employee[] employees = super.toArray(new Employee[0]);
        return employees[number - 1];
    }
}