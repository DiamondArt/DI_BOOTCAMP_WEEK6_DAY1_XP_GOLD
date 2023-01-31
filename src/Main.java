import static java.lang.Math.PI;

/**************************************************************
 * XP EXERCICE GOLD
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/
public class Main {
    public static void main(String[] args) {
        //instances of class Circle
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12.0);
        Circle circle3 = new Circle(24.0);

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());

        //instances of class Car
        Car myCar = new Car();
        Car myCar2 = new Car("Toyota","Toyota yaris",2007);
        Car myCar3 = new Car("Toyota","Toyota yaris",2007,"Red",10000.0);

        myCar.displayCarInfo();
        myCar2.displayCarInfo();
        myCar3.displayCarInfo();

        //instances of class Student
        Student defaultStudent = new Student();
        Student secondStudent = new Student("Adonis Koffi",18);
        Student thirdStudent = new Student("Samuel Backayoko",22,"Agronomie",'B');

        defaultStudent.displayStudentInfo();
        secondStudent.displayStudentInfo();
        thirdStudent.displayStudentInfo();

    }
}

/**
 *
 * Exercise 1 : Circle Constructor
 * ---------------------------------
 * 1-Design a class named Circle.
 * 2- Construct three circle objects with radius 2.0, 12, and 24
 * 3- Display the radius and area of each.
 * 4- A no-arg constructor set the default value of radius to 1.
 * 5- A getArea() function is used to return the area of circle.
 *
 */
class Circle{
    private double radius;

    Circle() {
        this.radius = 1.0;
    }
    Circle(double _radius) {
        this.radius = _radius;
    }

    public double getRadius() {  // Getter for radius
        return radius;
    }
    public void setRadius(double newRadius) {  // Setter for radius
        this.radius = newRadius;
    }
    public double getArea(){
        double area = PI * this.radius * this.radius;
        return area;
    }

}


/**
 *
 * Exercise 2 : Constructor Chaining
 * ---------------------------------
 * 1- Create a class called “Car” with the following properties:
 *   - make (String)
 *   - model (String)
 *   - year (int)
 *   - color (String)
 *   - price (double)
 * 2- Create a default constructor that initializes all properties to default values.
 * 3- Create a parameterized constructor that takes values for the make, model, and year properties, and uses the “this” keyword to call the default constructor and set the values of the remaining properties.
 * 4- Create another parameterized constructor that takes values for all properties, and uses the “this” keyword to call the previously created parameterized constructor and set the values of the make, model, and year properties.
 * 5- Create a method called “displayCarInfo” that prints out the values of all properties in the following format: “Make: <make>, Model: <model>, Year: <year>, Color: <color>, Price: <price>“
 * 6- In the main method, create an object of the Car class using each of the constructors and call the “displayCarInfo” method to display the property values for each object.
 *
 */
class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    /**
     * Default constructor
     */
    Car(){
        this.make = "Mercedes";
        this.model = "Mercedes-AMG classe A Compacte";
        this.year = 1995;
        this.color = "White";
        this.price = 62.349;
    }

    /**
     * Second constructor
     * @param _make
     * @param _model
     * @param _year
     *
     */
    Car(String _make, String _model, int _year){
        this();
        this.make = _make;
        this.model = _model;
        this.year= _year;
    }
    /**
     * Third constructor
     * @param _make
     * @param _model
     * @param _year
     * @param _color
     * @param _price
     */
    Car(String _make, String _model, int _year,String _color, double _price){
        this(_make,_model,_year);
        this.make = _make;
        this.model = _model;
        this.color = _color;
        this.price = _price;
        this.year= _year;
    }

    public void displayCarInfo(){
        String infoCar = "Make: <"+this.make+"> Model : <"+ this.model+"> Year: <"+this.year+"> Color: <"+ this.color+"> Price: <"+this.price+">";
        System.out.println(infoCar);
    }
}

/**
 *
 * Exercise 3 : Constructor Overloading
 * ---------------------------------
 * 1- Create a class called “Student” with the following properties:
 *   - name (String)
 *   - age (int)
 *   - course (String)
 *   - grade (char)
 * 2- Create a default constructor that initializes all properties to default values.
 * 3- Create a parameterized constructor that takes values for the make, model, and year properties, and uses the “this” keyword to call the default constructor and set the values of the remaining properties.
 * 4- Create another parameterized constructor that takes values for all properties, and uses the “this” keyword to call the previously created parameterized constructor and set the values of the make, model, and year properties.
 * 5- Create a method called “displayStudentInfo” that prints out the values of all properties in the following format: “Name: <name>, Age: <age>, Course: <course>, Grade: <grade>“
 * 6- In the main method, create an object of the Car class using each of the constructors and call the “displayStudentInfo” method to display the property values for each object.
 *
 */
class Student {
    private String name;
    private int age;
    private String course;
    private char grade;

    Student(){
        this.name ="Eleanor Yace";
        this.age = 23;
        this.course = "Communication";
        this.grade = 'A';
    }
    Student(String _name, int _age) {
        this();
        this.name = _name;
        this.age = _age;
    }
    Student(String _name, int _age, String _course, char _grade ) {
        this(_name,_age);
        this.name = _name;
        this.age = _age;
        this.course = _course;
        this.grade = _grade;
    }

    public void displayStudentInfo(){
        String infoStudent = "Name: <"+this.name+"> Age : <"+ this.age+"> Course: <"+this.course+"> Grade: <"+ this.grade+">";
        System.out.println(infoStudent);
    }
}


