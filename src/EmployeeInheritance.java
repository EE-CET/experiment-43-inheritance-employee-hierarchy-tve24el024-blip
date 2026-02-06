import java.util.Scanner;

class EmployeeInheritance {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class Experiment43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer officer = new Officer();
        officer.name = sc.nextLine();
        officer.age = Integer.parseInt(sc.nextLine());
        officer.phoneNumber = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = Double.parseDouble(sc.nextLine());
        officer.specialization = sc.nextLine();

        Manager manager = new Manager();
        manager.name = sc.nextLine();
        manager.age = Integer.parseInt(sc.nextLine());
        manager.phoneNumber = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = Double.parseDouble(sc.nextLine());
        manager.department = sc.nextLine();

        System.out.println("Officer:");
        System.out.println(officer.name);
        System.out.println(officer.age);
        System.out.println(officer.phoneNumber);
        System.out.println(officer.address);
        System.out.println((int) officer.salary);
        System.out.println(officer.specialization);

        System.out.println("Manager:");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phoneNumber);
        System.out.println(manager.address);
        System.out.println((int) manager.salary);
        System.out.println(manager.department);

        sc.close();
    }
}
