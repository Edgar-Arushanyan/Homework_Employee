package Homework_Employee;

public class Employee {
    //Задача 2.
    //Создать класс Employee , содержащий следующие поля и методы:
    //
    //поле имя,
    //поле зарплата,
    //поле количество рабочих часов в день,
    //конструктор
    //метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
    //метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
    //Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов

    private String name;

    private int salary;

    private  int workHour;


    public Employee(String name, int salary, int workHour) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }


    public int addSalary(){
        if (salary<500){
            this.salary= (salary+10);
        }
        return salary;
    }

    public int addForWork(){
        if (workHour>6){
            this.salary=(salary+5);
        }
        return salary;
    }

}
