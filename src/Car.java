public class Car extends Vehicle {

    String numberOfWheels;

    constructor(String model, String plate) {
        super(model, plate);
    }

    public getNumberOfWheels() {
        return this.numberOfWheels;
    }
    
}