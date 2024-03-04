package org.example.homework_2;

import org.example.homework_2.animal.Animal;
import org.example.homework_2.employee.Employee;

import java.util.List;

public class VetClinic {
    private final long inn;
    private final String nameCompany;
    private final String legalAddress;
    private List<Employee> employees = new MyArrayList<>();
    private List<Animal> patients = new MyArrayList<>();

    public VetClinic(long inn, String nameCompany, String legalAddress){
        this.inn = inn;
        this.nameCompany = nameCompany;
        this.legalAddress =legalAddress;
    }

    public long getInn() {
        return inn;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public void addPatients(Animal patient) {
        this.patients.add(patient);
    }

    @Override
    public String toString() {
        return "Ветеринарная клиника: " + nameCompany +
                " ИНН" + inn +
                " Юридический Адрес" +
                "\n\tСписок сотрудников:" + employees +
                "\n\tСписок пациентов:" + patients;
    }
}
