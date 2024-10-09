public class FourDoorToyota extends FourDoorCar {
    //Create FourDoorToyota


    public FourDoorToyota(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("FourDoorToyota is starting/running with " + speed + "speed");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("FourDoorToyota is accelerating to " + speed + "speed");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("FourDoorToyota is brakeing to " + speed + "speed");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("FourDoorToyota has stopped");
    }
}
