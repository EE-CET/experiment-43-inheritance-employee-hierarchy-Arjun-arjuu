import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;

    void display() {
        System.out.println("Officer:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        printSalary();
        System.out.println(specialization);
    }
}

class Manager extends Employee {
    String department;

    void display() {
        System.out.println("Manager:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        printSalary();
        System.out.println(department);
    }
}

public class EmployeeInheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Officer off = new Officer();
        off.name = sc.nextLine();
        off.age = Integer.parseInt(sc.nextLine());
        off.phoneNumber = sc.nextLine();
        off.address = sc.nextLine();
        off.salary = Integer.parseInt(sc.nextLine());
        off.specialization = sc.nextLine();
        Manager man = new Manager();
        man.name = sc.nextLine();
        man.age = Integer.parseInt(sc.nextLine());
        man.phoneNumber = sc.nextLine();
        man.address = sc.nextLine();
        man.salary = Integer.parseInt(sc.nextLine());
        man.department = sc.nextLine();

        off.display();
        man.display();

        sc.close();
    }
}
