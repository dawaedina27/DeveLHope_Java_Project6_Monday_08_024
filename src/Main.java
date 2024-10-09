


//Car <Interface>
//-> FourDoorCar <Abstract Class>
//->->FourDoorToyota <Class>
//->->FourDoorBMW <Class>
//->->FourDoorFord<Class>
//->->FourDoorHyundai <Class>
//-> TwoDoorCar <Abstract Class>
//->->TwoDoorToyota <Class>
//->->TwoDoorBMW <Class>
//->->TwoDoorFord <Class>
//->->TwoDoorHyundai <Class>



public class Main {
    public static void main(String[] args) {

        FourDoorCar car1 = new FourDoorCar("dawaXM", "dawa1", 10000000, 200, 50);

        FourDoorBMW car2 = new FourDoorBMW("Nisan","Doublex", 20000000, 120, 60 );
        FourDoorToyota car3 = new FourDoorToyota("ABC", "UUU", 30000000, 100, 71);
        FourDoorHyundai car4 = new FourDoorHyundai("JJ", "V8", 90000000, 100, 94);
        FourDoorFord car = new FourDoorFord("Juma"", "GGC", 10000000, 105, 87);


        TwoDoorToyota car5 = new TwoDoorToyota("hmvc", "gggoodday", 55.00, 180, 88);
        TwoDoorBMW car6 = new TwoDoorBMW("ZEro", "SSSSDT", 4400000, 110, 30);
        TwoDoorFord car7 = new TwoDoorFord("XYZ", "BBD",70000000, 65, 101);

       // System.out.println("SellingP")

        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.stop();


        car2.start();
        car2.accelerate();
        car2.accelerate();
        car2.brake();
        car2.stop();


        car3.start();
        car3.accelerate();
        car3.accelerate();
        car3.brake();
        car3.stop();

        car4.start();
        car4.accelerate();
        car4.accelerate();
        car4.brake();
        car4.stop();

        car5.start();
        car5.accelerate();
        car5.accelerate();
        car5.brake();
        car5.stop();

        car6.start();
        car6.accelerate();
        car6.accelerate();
        car6.brake();
        car6.stop();

        car7.start();
        car7.accelerate();
        car7.accelerate();
        car7.brake();
        car7.stop();

    }
}


interface Car {
    public void start();

    public void stop();

    public void accelerate();

    public void brake();

    double sell();

}

class FourDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;

    //Add Sell Function that returns double into Car interface and implement it from the inner classes(calculate price by year mileage and power)
    int year;
    double mileage;
    double power;
    public FourDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;

        //Add Sell Function that returns double into Car interface and implement it from the inner classes(calculate price by year mileage and power)

        this.year = year;
        this.mileage = mileage;
        this.power = power;
        speed = 0;
    }

    public FourDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
    }

    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }

    public double sell() {
    double sellingPrice = ((power/mileage/year) * 15000000);

    if (sellingPrice < 0 ){
        sellingPrice = 0;
    }

    return sellingPrice;

    }

    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}
abstract class TwoDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    public TwoDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}

//Create FourDoorToyota, FourDoorBMW,  FourDoorFord, FourDoorHyundai classes, inherited from FourDoorCar.
//
//Implement necessary functions and write constructor.

//Create FourDoorBMW,
class FourDoorBMW extends FourDoorCar{

    public FourDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        speed = 0;
        super.start();
        System.out.println("FourDoorBMW is starting/running with " + speed + "speed");
    }

    @Override
    public void accelerate() {
        speed += 10;
        super.accelerate();
        System.out.println("FourDoorBMW is accelerating to " + speed + "speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }

        super.brake();
        System.out.println("FourDoorBMW is brakeing to " + speed + "speed");
    }

    @Override
    public void stop() {
        speed = 0;
        super.stop();
        System.out.println("FourDoorBMW has stopped");
    }

    @Override
    public String toString() {
        return "FourDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }


    //Create FourDoorFord

    static class FourDoorFord extends FourDoorCar{

        public FourDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity) {
            super(model, name, price, maxSpeed, fuelCapacity);
        }

        @Override
        public void start() {
            speed = 0;
            super.start();
            System.out.println("FourDoorFord is starting/running with " + speed + "speed");
        }

        @Override
        public void accelerate() {
            speed += 10;
            super.accelerate();
            System.out.println("FourDoorFord is accelerating to " + speed + "speed");
        }

        @Override
        public void brake() {
            if(speed > 0){
                speed -= 10;
            }
            if (speed < 0) {
                speed = 0;
            }
            super.brake();
            System.out.println("FourDoorFord is brakeing to " + speed + "speed");
        }

        @Override
        public void stop() {
            speed = 0;
            super.stop();
            System.out.println("FourDoorFord has stopped");
        }

        @Override
        public String toString() {
            return "FourDoorFord{" +
                    "model='" + model + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", maxSpeed=" + maxSpeed +
                    ", fuelCapacity=" + fuelCapacity +
                    ", speed=" + speed +
                    ", kmPerSpeed=" + speed +
                    ", year=" + year +
                    ", mileage=" + mileage +
                    ", power=" + power +
                    '}';
        }
    }

//Create FourDoorHyundai
class FourDoorHyundai extends FourDoorCar{

    public FourDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        speed = 0;
        super.start();
        System.out.println("FourDoorHyundai is starting/running with " + speed + "speed");
    }



    @Override
    public void accelerate() {
        speed += 10;
        super.accelerate();
        System.out.println("FourDoorHyundai is accelerating to " + speed + "speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        super.brake();
        System.out.println("FourDoorHyundai is brakeing to " + speed + "speed");
    }

    @Override
    public void stop() {
        speed = 0;
        super.stop();
        System.out.println("FourDoorFord has stopped");
    }


    @Override
    public String toString() {
        return "FourDoorHyundai{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" +speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
    }

//Create TwoDoorToyota, TwoDoorBMW,  TwoDoorFord, TwoDoorHyundai classes, inherited from TwoDoorCar.
//
//Implement necessary functions and write constructor.

class TwoDoorToyota extends TwoDoorCar{
    //TwoDoorToyota class

    public TwoDoorToyota(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        speed = 0;
        super.start();
        System.out.println("TwoDoorToyota is starting/running with " + speed + "speed");
    }
    @Override
    public void accelerate() {
        speed += 10;

        super.accelerate();
        System.out.println("TwoDoorToyota is accelerating to " + speed + "speed");
    }
    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        super.brake();
        System.out.println("TwoDoorToyota is brakeing to " + speed + "speed");
    }


    /**
     * @return
     */
    @Override
    public double sell() {
        return 0;
    }

    @Override
    public void stop() {
        speed = 0;
        super.stop();
        System.out.println("TwoDoorToyota has stopped");
    }



    @Override
    public String toString() {
        return "TwoDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" +speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }

}

//TwoDoorBMW
class TwoDoorBMW extends TwoDoorCar {

    public TwoDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        speed = 0;
        super.start();
        System.out.println("TwoDoorBMW is brakeing to " + speed + "speed");
    }

    @Override
    public void accelerate() {
        speed += 10;
        super.accelerate();
        System.out.println("TwoDoorBMW is accelerating to " + speed + "speed");
    }


    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        super.brake();
        System.out.println("TwoDoorBMW has stopped");
    }

    /**
     * @return
     */
    @Override
    public double sell() {
        return 0;
    }

    @Override
    public void stop() {
        speed = 0;
        super.stop();
        System.out.println("TwoDoorBMW is brakeing to " + speed + "speed");
    }

    @Override
    public String toString() {
        return "TwoDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" +speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

// TwoDoorFord class

class TwoDoorFord extends TwoDoorCar{

    public TwoDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }


    @Override
    public void start() {
        speed = 0;
        super.start();
        System.out.println("TwoDoorFord is starting/running with " + speed + "speed");
    }

    @Override
    public void accelerate() {
        speed += 10;
        super.accelerate();
        System.out.println("TwoDoorFord is accelerating to " + speed + "speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        super.brake();
        System.out.println("TwoDoorFord is brakeing to " + speed + "speed");
    }

    /**
     * @return
     */
    @Override
    public double sell() {
        return 0;
    }

    @Override
    public void stop() {
        speed = 0;
        super.stop();
        System.out.println("TwoDoorFord has stopped");
    }

    @Override
    public String toString() {
        return "TwoDoorFord{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" +speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }

    //TwoDoorHyundai

    class TwoDoorHyundai extends TwoDoorCar{

        public TwoDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity) {
            super(model, name, price, maxSpeed, fuelCapacity);
        }

        @Override
        public void start() {
            speed = 0;
            super.start();
        }

        @Override
        public void accelerate() {
            speed += 10;
            super.accelerate();
        }

        @Override
        public void brake() {
            if(speed > 0){
                speed -= 10;
            }
            if (speed < 0) {
                speed = 0;
            }
            super.brake();
        }

        /**
         * @return
         */
        @Override
        public double sell() {
            return 0;
        }

        @Override
        public void stop() {
            speed = 0;
            super.stop();
        }

        @Override
        public String toString() {
            return "TwoDoorHyundai{" +
                    "model='" + model + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", maxSpeed=" + maxSpeed +
                    ", fuelCapacity=" + fuelCapacity +
                    ", speed=" + speed +
                    ", kmPerSpeed=" +speed +
                    ", year=" + year +
                    ", mileage=" + mileage +
                    ", power=" + power +
                    '}';
        }
    }
}







