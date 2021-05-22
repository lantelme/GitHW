package HW6.Animal;

public class Animal {

    protected String name;
    protected String color;
    protected int size;
    protected int weight;
    protected int speed;
   //
    public Animal(String name, String color, int size, int weight, int speed){
        this.color = color;
        this.size = size;
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }
    public void run (int obsLengthRun){
        System.out.println(name + " running "+obsLengthRun + " m" + " with speed " + speed);
    }
    public void swim (int obsLengthSwim){
         System.out.println(name + " swimming "+obsLengthSwim + " m");}


}
