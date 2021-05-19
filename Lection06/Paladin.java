package Lection06;

import Lection06.model.Unit;

public class Paladin extends Unit {

    private int level;
//    private String name;

    public Paladin(String name) {
        super(name);
    }
    public Paladin(String name,int health, int attack, int defence, int power){
            super(name, health, attack, defence, power);
//        System.out.println("name " + name);
//        this.name = name;//My inner-name is Paladin
        this.level = -1;
    }
    public Paladin(String name,int health, int attack, int defence, int power, int level){
        super(name,health,attack,defence,power);
        this.level = level;
    }

//    public void doSomething(){
//        super.speak();
//        System.out.println("my logic");
//    }
  //  @Override
//    public void speak(){ //дает разрешение на использование только паладину
//        super.speak();
//    }
    public void defenceSelf(){
        System.out.println(this.name + " has block " + this.defence + " points");
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void jump(){
        System.out.println(this.name + " jump");
    }

//    public String getInnerName(){
//        return this.name;
//    }
}
