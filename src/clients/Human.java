package clients;

import java.time.LocalDate;

public class Human extends Animal{
    public Human(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void HumanLifeCycle(){
        toGo();
        fly();
    }
    private void toGo(String destination){
        System.out.println(getType() + " goes to " + destination);
    }
    protected void fly(){
        System.out.println("Human cannot fly.");
    }
}
