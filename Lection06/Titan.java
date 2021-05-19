package Lection06;


public class Titan extends Paladin {

    public Titan(String name,int health, int attack, int defence, int power, int level){
        super(name,health,attack,defence,power,level);
    }
    public void superDamage(){
        System.out.println(this.name + " deal super attack at " + this.attack * this.power * 150);
    }

    @Override
    //переопределение методов/полиморфизм
    public void healSelf(int value){
        System.out.println("I don't have idea - what is Heal-self");
    }
    @Override
    public void speak() {
        super.speak();//заимствование у родителя любого метода
        System.out.println("Hello from Override method from Titan");
    }
    @Override
    public void jump(){
        System.out.println("Titan not jump");
    }
}
