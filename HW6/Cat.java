package HW6;

import HW6.Animal.Animal;

public class Cat extends Animal {

    public Cat(String name, String color, int size, int weight, int speed){
        super(name,color,size,weight,speed);
    }

    @Override
    public void run(int obsLengthRun){
        if (obsLengthRun <= 200){
            System.out.println(name + " ran " + obsLengthRun + "m with speed " + speed + "km/h");
        } else {
            System.out.println(name + " tired and won't run anymore");
        }
    }

    @Override
    public void swim(int obsLengthSwim){
        System.out.println(name + " can't swim");
    }


}
