package Java_OOPS;

public class copyConstructor {

    public
    String name;
    int age;

    public copyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public copyConstructor(copyConstructor employee) {
        this.name = employee.name;
        this.age = employee.age;
    }

    public static void main(String[] args) {

        copyConstructor employee1 = new
                copyConstructor("Rajas",25);

        System.out.println("First Object: ");
        System.out.println("Employee Name: "+employee1.name + ", Age: "+employee1.age);

        copyConstructor employee2 = new copyConstructor(employee1);
        System.out.println("Copy constructor , after sending copy of the first  Object: ");
        System.out.println("Employee Name: "+employee2.name + ", Age: "+employee2.age);


    }
}
