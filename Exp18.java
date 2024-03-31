class Person {
    String name;
    int age;
}

class Employee extends Person {
    int employeeId;
    int salary;
}

public class Exp18_Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Abc";
        p.age = 25;
        
        Employee e = new Employee();
        e.name = "Xyz";
        e.age = 23;
        e.employeeId = 123;
        e.salary = 50000;
        
        System.out.println("Name in person : " + p.name);
        System.out.println("Age in person : " + p.age);
        
        System.out.println("Name in employee : " + e.name);
        System.out.println("Age in employee : " + e.age);
        System.out.println("Employee ID in employee : " + e.employeeId);
        System.out.println("Salary in employee : " + e.salary);
    }
}
