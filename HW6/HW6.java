package HW6;

public class HW6 {
    public static void main(String[] args) {
        Dog dogs = new Dog("Maffin", "black", 20, 7, 12);
        Cat cats = new Cat("Marquis", "white", 13, 5, 14);

        cats.run(120);
        dogs.run(50);
        System.out.println(" ");

        cats.swim(120);
        dogs.swim(10);


    }
}
