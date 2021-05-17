package Lection05;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int number;
    private int salary;
    private int age;

    public Employee() {

    }

    public Employee(String fullName, String position, String email, int number, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    void infOut() {
        System.out.println(fullName + " works in the position " + position + " and gets " + salary + " rub");
    }

    public int getAge() {
        return age;
    }
}
