package Stepik.lesson_2_8.Entities.Employee;

public class Employee implements Stepik.lesson_2_8.Interface.Employee {
    private final String lastname;
    private final String firstname;
    private final String surname;
    private POSITION position;

    public Employee(String lastname, String firstname, String surname, POSITION position) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.position = position;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPosition(POSITION position) {
        this.position = position;
    }

    public POSITION getPosition() {
        return position;
    }
    public String getPositionString() {
        return position.toString();
    }
    public double getSalary() {
        return position.getWage();
    }
    public String toString() {
        return "Сотрудник: " + surname + " " + firstname + " " + lastname + ". Должность: " + getPositionString() + ". Оплата за час: " + getSalary() +" $";
    }
}
