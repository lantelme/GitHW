package Lection06;

import Lection06.model.Unit;

public class Lection06 {

    public static void main(String[] args) {
     Paladin paladin = new Paladin("Paladin", 100, 25, 15, 50);
     Archer archer = new Archer("Archer", 75, 50,2,75);
     Mage mage =  new Mage("Mage", 25,100,0,100);
//     Titan titan = new Titan("Titan", 1500, 200, 100, 100, 99);
//
//     Paladin paladinTest = new Paladin("PaladinTest", 150, 35, 20, 75, 15);
//
////     paladin.speak();
//
////     titan.speak();
////     titan.getDamage();
////     titan.healSelf(150);
////     titan.defenceSelf();
////     titan.superDamage();
////     titan.jump();
//
////     System.out.println("My inner-name is " + paladin.getInnerName());
////     paladin.getDamage();
////     paladin.healSelf(15);
////     paladin.defenceSelf();
////     System.out.println();
////
////     archer.speak();
////     archer.getDamage();
////     archer.healSelf(30);
////     System.out.println();
////
////     mage.speak();
////     mage.getDamage();
////     mage.healSelf(100);
////     System.out.println("Paladin lvl = " + paladin.getLevel());
////     System.out.println("PaladinTest lvl = " + paladinTest.getLevel());
//
////     byte b1 = 40;
////     int i1 = b1;
////     System.out.println(i1);
////
////     int i2 = 256;
////     byte b2 = (byte) i2; //перевод в байт/ type casting (приведение типов)
////     System.out.println(b2);
//
//     Unit[] army = {paladin,archer, mage, titan};
//
//     for (int i = 0; i < army.length; i++) {
//      army[i].speak();
//      army[i].getDamage();
//      army[i].jump();
//
//      if (army[i] instanceof Paladin){//объект был создан на основе класса
//       Paladin tmpPaladin = (Paladin) army[i];//указание, что тут точно паладин(пример с байтами)
//       tmpPaladin.defenceSelf();
//      }
//
//      //если, текущий элемент массива ПРИНАДЛЕЖИТ классу Paladin, то
//      //я создаю ссылку, в которой будет храниться 100% Paladin (приведение к типу Паладин)
//      //вызываю по ссылке у объекта его личный метод
//
//      if (army[i] instanceof Titan){
//       ((Titan) army[i]).superDamage();//обязательно скобки, как в математике/последовательность действий
//      }
//
//     }
//

     int myInt = 50;
     String myString = "Hello";
     Object[] myArrayObjects = new Object[3];
     myArrayObjects[0] = myInt;
     myArrayObjects[1] = myString;
     myArrayObjects[2] = paladin;

     for (int i = 0; i < myArrayObjects.length; i++) {
      if (myArrayObjects[i] instanceof String) {
       System.out.println(((String)myArrayObjects[i]).length());
      }

      //в джаве - все объекты!
     }

    }

}
