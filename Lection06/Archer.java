package Lection06;

import Lection06.model.Unit;

public class Archer extends Unit {

    public Archer(String name,int health, int attack, int defence, int power){
        super(name,health,attack,defence,power);
    }

    @Override
    public void jump(){
        System.out.println(this.name + " jump+jump+jump");
    }

}
