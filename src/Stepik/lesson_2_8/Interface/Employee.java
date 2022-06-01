package Stepik.lesson_2_8.Interface;

import Stepik.lesson_2_8.Entities.Employee.POSITION;

public interface Employee {
    String getLastname();
    String getFirstname();
    String getSurname();
    void setPosition(POSITION position);
    POSITION getPosition();
    String getPositionString();
    double getSalary();
    String toString();
}
