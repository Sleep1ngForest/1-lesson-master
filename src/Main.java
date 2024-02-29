import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 45, LocalDate.of
                (2007, 2, 3), new Owner());
        Lion liova2 = new Lion("Далбан", 40, LocalDate.of
                (2007, 2, 3), new Owner());
        Cat cat1 = new Cat("murzik", 7, LocalDate.of
                (2028, 5, 12), new Owner());
        Eagle eagle1 = new Eagle("Орёл", 21, LocalDate.of
                (2009, 5, 20), new Owner());
        Fish fish1 = new Fish("бульбул", 4, LocalDate.of
                (2023, 7,22), new Owner());
        Human human1 = new Human("Андрей", 69, LocalDate.of
                (1978, 10,30), new Owner());
        WaterSnake snake1 = new WaterSnake("ssss", 5, LocalDate.of
                (2022, 2, 2), new Owner());
        System.out.println(liova);
        System.out.println(liova2);
        System.out.println(cat1);
        System.out.println(eagle1);
        System.out.println(fish1);

        List<Animal> animals = new ArrayList<>();
        animals.add(liova);
        animals.add(liova2);
        animals.add(cat1);
        animals.add(eagle1);
        animals.add(fish1);
        cat1.CatLifeCycle();
        eagle1.EagleLifeCycle();
        fish1.FishLifeCycle();
        snake1.SnakeLifeCycle();
    }
}