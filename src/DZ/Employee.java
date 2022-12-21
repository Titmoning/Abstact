package DZ;

public class Employee extends Person{
    private int salary;
    private String grade;

    public Employee(String name, String surname, int age, String gender, int salary, String grade) {
        super(name, surname, age, gender);
        this.salary = salary;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", grade='" + grade + '\'' +
                "} " + super.toString();
    }
}
