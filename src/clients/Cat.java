package clients;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void CatLifeCycle(){
        meow();
        toGo();
        meow();
        swim();
    }
    private void meow(){
        System.out.println(getType() + " Meow");
    }
    protected void toGo(String destination){
        System.out.println(getType() + " is going " + destination);
    }
    protected void swim(){
        System.out.println("Cat cannot swim.");
    }
    protected void fly(){
        System.out.println("Cat cannot fly.");
    }
}