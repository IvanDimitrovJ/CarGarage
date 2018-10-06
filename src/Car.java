import java.util.ArrayList;

public class Car {
    String make;
    String model;
    String color;
    double horsePower;
    double engine;
    String transmission;
    int year;

    Car(){
        this.make = "";
        this.model = "";
        this.color = "";
        this.horsePower = 0;
        this.engine = 0;
        this.year = 0;
    };

    Car(String make, String model, String color, double horsePower, double engine, String transmission, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.engine = engine;
        this.transmission = transmission;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if(transmission.equals("manual") || transmission.equals("automatic")) {
            this.transmission = transmission;
        } else {
            transmission = "Unkown Type";
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }





    //Създайте трети метод, който по подаден масив от коли проверява дали измежду колите има повтарящи се
    // и връща “прочистен” масив от коли, в който няма повтарящи се коли.


    public int compareCars(Car other){
        if(this.getMake().equals(other.getMake()))
            if(this.getModel().equals(other.getModel()))
                if(this.getColor().equals(other.getColor()))
                    if(this.getEngine() == other.getEngine())
                        if(this.getHorsePower() == other.getHorsePower())
                            if(this.getTransmission().equals(other.getTransmission()))
                                if(this.getYear() == other.getYear())
                                    return 1;

        return  0;
    }
    public void copyData(Car other) {
       // Car temp = new Car();

        this.setMake(other.getMake());
        this.setModel(other.getModel());
        this.setColor(other.getColor());
        this.setHorsePower(other.getHorsePower());
        this.setEngine(other.getEngine());
        this.setTransmission(other.getTransmission());
        this.setYear(other.getYear());

    /*    //temp = this
        temp.setMake(other.getMake());
        temp.setModel(other.getModel());
        temp.setColor(other.getColor());
        temp.setHorsePower(other.getHorsePower());
        temp.setEngine(other.getEngine());
        temp.setTransmission(other.getTransmission());
        temp.setYear(other.getYear());


          //other = temp
        other.setMake(temp.getMake());
        other.setModel(temp.getModel());
        other.setColor(temp.getColor());
        other.setHorsePower(temp.getHorsePower());
        other.setEngine(temp.getEngine());
        other.setTransmission(temp.getTransmission());
        other.setYear(temp.getYear());
        */
        //this = other
    }

    public void printDataForCar() {
        System.out.println("Make: " + this.getMake());
        System.out.println("Model: " + this.getModel());
        System.out.println("Color: " + this.getColor());
        System.out.println("Horse Power: " + this.getHorsePower());
        System.out.println("Engine: " + this.getEngine());
        System.out.println("Transmission: " + this.getTransmission());
        System.out.println("Year: " + this.getYear());
    }
}
