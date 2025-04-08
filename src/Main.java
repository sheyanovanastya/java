public class Main {
    public static void main(String[] args) {
        // 1. Наслідування (Animal)
        Animal dog = new Dog("Buffy");
        Animal cat = new Cat("Dimon");

        dog.makeSound();
        cat.makeSound();

        Vehicle myCar = new Car("Audi");
        myCar.displayInfo();

        Person person1 = new Person("Vlad", 19);
        Person person2 = new Person("Vladik", 19);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("Equal? " + person1.equals(person2));

        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(6, 8);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Movable car = new Car("BMW");
        Movable bike = new Bike();
        car.move();
        bike.move();
    }
}