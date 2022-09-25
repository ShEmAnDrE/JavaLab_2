package com.company;

public class TestHuman {
    public static void main(String[] args) {
        Human h1 = new Human("Alex",30,'M',"Brown", "Blue", 200, "white", 48);
        System.out.println(h1.getName() + " is " + h1.getAge() + " years old");
        System.out.println(h1.getName() + " has " + h1.getColorOfEyes() + " eyes");
        System.out.println(h1.getName() + " has a " + h1.getFootSize(1) + " foot size");
        System.out.println(h1.getName() + " has a " + h1.getColorOfHair() + " hair");
        System.out.println(h1.getName() + " has a " + h1.getSkinColor() + " skin");
        System.out.println(h1.getName() + " has a \"" + h1.getGender() +"\" gender");
        System.out.println(h1.getName() + "has a " + h1.getHeight() + "cm height");
        h1.thinking();
        h1.listening();
        h1.kicking(1);
        h1.walking(1);
        h1.taking(1);
        h1.speaking("Hello world!");
        h1.setIntegrityOfNose(false);
        h1.setIntegrityOfHand(1,false);
        h1.setIntegrityOfLeg(1, false);
        h1.setIntegrityOfNose(true);
        h1.setIntegrityOfHand(1,true);
        h1.setIntegrityOfLeg(1, true);
    }
}
