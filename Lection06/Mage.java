package Lection06;

import Lection06.model.Unit;

public class Mage extends Unit { //наследование от родителя


    public Mage(String name,int health, int attack, int defence, int power){
        super(name,health,attack,defence,power);//посылает в общий класс
    }

    @Override
    public void jump(){
        System.out.println(this.name + " jump+jump");
    }
}
