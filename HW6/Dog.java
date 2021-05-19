package HW6;

import HW6.Animal.Animal;

public class Dog extends Animal {
    public Dog (String name, String color, int size, int weight, int speed){
        super(name,color,size,weight,speed);
    }

    @Override
    public void run(int obsLengthRun){
        if (obsLengthRun <= 500){
            System.out.println(name + " ran " + obsLengthRun + "m with speed " + speed + "km/h");
        } else {
            System.out.println(name + " tired and won't run anymore");
        }
    }

    @Override
    public void swim(int obsLengthSwim){
        if (obsLengthSwim <= 10){
            System.out.println(name + " swimming " + obsLengthSwim + " m");
    } else {
            System.out.println(name + " tired and won't swim anymore");
        }

    }
}
