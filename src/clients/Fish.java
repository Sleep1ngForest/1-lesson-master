package clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void FishLifeCycle(){
        swim();
        swim("ocean");
    }
    protected void swim(){
        System.out.println(getType() + " swims");
    }
    protected void swim(String destination){
        System.out.println(getType() + " is swimming to " + destination);
    }
    protected void fly(){
        System.out.println("Fish cannot fly");
    }
}
