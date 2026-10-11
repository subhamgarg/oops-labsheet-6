// Question 2: Vehicle and Car (Overriding)
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class Question_02 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        
        myVehicle.drive();
        myCar.drive();
    }
}
