import java.util.Scanner;

class EmployeeInheritance {
    String name;
    int age;
    long phoneNumber;
    String address;
    int salary;

    Employee(String name, int age, long phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, int age, long phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

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

    Manager(String name, int age, long phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

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

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String oName = sc.nextLine();
        int oAge = sc.nextInt();
        long oPhone = sc.nextLong();
        sc.nextLine();
        String oAddress = sc.nextLine();
        int oSalary = sc.nextInt();
        sc.nextLine();
        String specialization = sc.nextLine();

        Officer officer = new Officer(oName, oAge, oPhone, oAddress, oSalary, specialization);

        String mName = sc.nextLine();
        int mAge = sc.nextInt();
        long mPhone = sc.nextLong();
        sc.nextLine();
        String mAddress = sc.nextLine();
        int mSalary = sc.nextInt();
        sc.nextLine();
        String department = sc.nextLine();

        Manager manager = new Manager(mName, mAge, mPhone, mAddress, mSalary, department);

        officer.display();
        manager.display();
    }
}
