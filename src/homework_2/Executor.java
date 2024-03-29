package org.example.homework_2;

import org.example.homework_2.animal.*;
import org.example.homework_2.employee.Employee;
import org.example.homework_2.employee.post.Doctor;
import org.example.homework_2.employee.post.DoctorsContract;
import org.example.homework_2.employee.post.Nurse;
import org.example.homework_2.employee.post.NurseContract;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Executor {
    public void startProgram() {
        String city = "Архангельск";
        Cat catVasily = new Cat.Builder()
                .setName("Яша")
                .setGender("Кот")
                .setBirthDay(LocalDate.of(2023, 8, 5))
                .setLocation(city)
                .build();

        Fish fishDolli = new Fish.Builder()
//                .setBirthDay(LocalDate.of(2022, 5, 18))
                .setName("Dolli")
                .build();

        Person person1 = new Person.Builder()
                .setSecondName("Иванов")
                .setName("Иван")
                .setMiddleName("Иванович")
                .setGender("Мужской")
                .setBirthDay(LocalDate.of(1991, 3, 25))
                .setLocation(city)
                .setPets(catVasily)
                .setPets(fishDolli)
                .build();

        Person person2 = new Person.Builder()
                .setName("Валерия")
                .setGender("Женский")
                .setBirthDay(LocalDate.of(1995, 1, 3))
                .setLocation(city)
                .build();

        person2.setSecondName("Иванова");
        person2.setMiddleName("Валерьевна");

        catVasily.setOwner(person1);
        fishDolli.setOwner(person1);
        Animal duck = new Duck.Builder()
                .setName("Дикая утка").build();

        Employee emp = new Employee.Builder()
                .setPerson(person1)
                .setPost(new Doctor("Доктор", 11, 1500))
                .build();

        Employee emp2 = new Employee.Builder()
                .setPerson(person2)
                .setPost(new Nurse("Мед сестра", 12, 1000))
                .build();


        VetClinic vetClinic = new VetClinic(22222, "Шарик", "Архангельск ул. Такая то");
        vetClinic.addEmployee(emp);
        vetClinic.addEmployee(emp2);
        vetClinic.addPatients(catVasily);
        vetClinic.addPatients(fishDolli);
        vetClinic.addPatients(duck);

        System.out.println(vetClinic);

        System.out.println(vetClinic.getEmployees().get(1).getPerson().run(20));

        List<Employee> listEmployee = vetClinic.getEmployees();
        for (Employee employee : listEmployee) {
            if (employee.getPost() instanceof DoctorsContract post) {
                post.diagnose();
                post.prescribeTreatment();
                post.prescribeMedication();
                post.issueSickLeave();
            }
            if (employee.getPost() instanceof NurseContract post) {
                post.giveInjections();
            }
        }
        List<Animal> animals = vetClinic.getPatients();
        Random random = new Random();
        for (Animal animal : animals){
            if (animal instanceof Fly animalFly){
                animalFly.fly(random.nextInt(25));
            }
            if (animal instanceof Run animalRun){
                animalRun.run(random.nextInt(25));
            }
            if (animal instanceof Swim animalSwim){
                animalSwim.swim(random.nextInt(25));
            }

        }
    }

    public void calculator() {

        MyInterfaceCalculate<Object>[] methods = new MyInterfaceCalculate[]{
                args -> (String)args[0] + args[1], // Сложение строк
                args -> ((String)args[0]).repeat((int)args[1]), // Умножение строк
                args -> (double)args[0] + (float)args[1] - (int)args[2], // (x, y, z) -> x + y - z
                args -> Math.pow((double) args[0], (double) 1 / (int) args[1])
        };

        System.out.println("Сложение строк -> " + mySuperMethodCalculate(methods[0], "54", 5));
        System.out.println("Умножение строк -> (x, y) -> x.repeat(y) " +
                mySuperMethodCalculate(methods[1], "GeekBrains ", 10));

        System.out.println("(x, y, z) -> x + y - z = " +
                mySuperMethodCalculate(methods[2], 5d, 4f, 6));

        System.out.println("корень числа x в степени y: (x, y) -> Math.pow(x, 1 / y) = " +
                mySuperMethodCalculate(methods[3], 27d, 3));
    }

    @FunctionalInterface
    public interface MyInterfaceCalculate<T> {
        T arithmeticExpression(T[] args);
    }

    @SafeVarargs
    private <T> T mySuperMethodCalculate(MyInterfaceCalculate<T> method, T... args) {
        return method.arithmeticExpression(args);
    }
}
