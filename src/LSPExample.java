//завдання 3
class Bird {
    public void eat() {
        System.out.println("Птах їсть");
    }

    public void walk() {
        System.out.println("Птах ходить");
    }
}

interface Flyable {
    void fly();
}

class Eagle extends Bird implements Flyable {
    public void fly() {
        System.out.println("Орел літає");
    }
}

class Penguin extends Bird {
    // Не реалізує Flyable — не літає
}

public class LSPExample {
    public static void main(String[] args) {
        Bird bird = new Eagle(); // можна замінити Bird на Eagle
        bird.eat();
        bird.walk();

        Flyable flyingBird = new Eagle();
        flyingBird.fly();

        Bird penguin = new Penguin();
        penguin.eat();
        penguin.walk();
    }
}
