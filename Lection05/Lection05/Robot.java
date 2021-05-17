package Lection05;

public class Robot {

    private String name;
    private int health;
    private int energy;
    private int speed;
    private String color;
    private leg legs;

    public static int countProcessor = 4;
    public Robot (){
      //  this.color = "Yellow";
    }//конкструктор

    public Robot(String name, int health, int energy, int speed, String color){
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.speed = speed;
        this.color = color;
        legs = new leg();
        speak();

    }
    static void doSomething(){
        System.out.println("doSomething");
    }

    void shooting(){ //модификатор доступа - default(package private), вызываются только в том package,
        //в котором находимся
        energy -= 10;
        System.out.println(name + " has shoot! Energy now is " + energy);
    }

    void speak() {
        System.out.println(name + " says Hello");
    }

    void move(){
        System.out.println(name + " has moved on speed " + speed);
    }

    public static class leg {

        String color;
        static int length;
        int weight;

        void jump (){
            System.out.println("This leg jump");
        }

    }

    //getter
    public  String getName(){
        return name;
    }


    //setter

    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setLegs(leg legs) {
        this.legs = legs;
    }
}
