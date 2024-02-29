package clients;

import java.time.LocalDate;

public class WaterSnake extends Animal{
    public WaterSnake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void SnakeLifeCycle(){
        fly();
    }
    protected void fly(){
        System.out.println("Snake cannot fly.");
    }
}
