// Interface
interface Vehicle {
    String start();
}

// Abstract class
abstract class Transport implements Vehicle {
    String model;

    public Transport(String model) {
        this.model = model;
    }
}

// Bicycle class
class Bicycle extends Transport {
    public Bicycle(String model) {
        super(model);
    }

    @Override
    public String start() {
        return "Bicycle is now pedaling";
    }
}

// Car class
class Car extends Transport {
    public Car(String model) {
        super(model);
    }

    @Override
    public String start() {
        return "Car engine is starting";
    }
}

// Main class
public class Exercise {
    public static void main(String[] args) {
        // Create objects using interface reference
        Vehicle bike = new Bicycle("Mountain Bike");
        Vehicle sedan = new Car("Sedan");

        // Print results
        System.out.println(bike.start());
        System.out.println(sedan.start());
    }
}
