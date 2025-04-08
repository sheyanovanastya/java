public class Car extends Vehicle implements Movable {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car brand: " + brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " car is moving");
    }
}