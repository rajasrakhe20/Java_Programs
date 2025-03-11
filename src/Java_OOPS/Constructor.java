package Java_OOPS;

public class Constructor {

    public
        String name;
        int age;

    // Non- parameterized constructor
    public Constructor() {
        System.out.println("Non-parameterized constructor is called");
    }

    // Parameterized constructor
    public Constructor(String name, int age){
        System.out.println("Parameterized constructor is called");
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Employee Name:" + name +" " + "Age: "+age);
    }

    public static void main(String[] args) {

        System.out.println("When is object is created constructor is called");
        Constructor obj = new Constructor();
        Constructor employee = new Constructor("Rajas",25);
        employee.display();

    }
}
