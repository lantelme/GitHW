package Lection05;


public class Person {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Peter", "engineer", "asdf@gmail.com", 334567, 100000, 38);
        persArray[1] = new Employee("Gagarina Kristina", "engineer", "jjjj@mail.ru", 354662, 90000, 40);
        persArray[2] = new Employee("Kotov Michail", "an electrician", "oomd@ya.ru", 333537, 120000, 43);
        persArray[3] = new Employee("Vasin Grigory", "teacher", "qwerty@mail.ru", 331237, 94000, 65);
        persArray[4] = new Employee("Pavlovsky Ivan", "engineer", "hhh@ya.ru", 338966, 102000, 33);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                persArray[i].infOut();
            }

        }


    }
}
