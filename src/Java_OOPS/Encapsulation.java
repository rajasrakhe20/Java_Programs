package Java_OOPS;

class Square{
    private int side;

    public void setSide(int side){
        this.side=side;
    }

    public int getArea(){
        return side*side;
    }
}

class Rectangle{

    private int  length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return (length*breadth);
    }

    public int getPerimeter(){
        return (2*(length+breadth));
    }

}


class Person {
    private int age;
    private  String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}

public class Encapsulation {

    public static void main(String[] args)
    {
        // person object created
        Person person = new Person();
        person.setName("Rajas");
        person.setAge(30);

        // Using methods to get the values for corresponding data variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Area is: "+ rectangle.getArea());
        System.out.println("Perimtere is: "+ rectangle.getPerimeter());

        Square square = new Square();
        square.setSide(5);
        System.out.println("Area of a sqaure is:  "+ square.getArea());

    }
}
