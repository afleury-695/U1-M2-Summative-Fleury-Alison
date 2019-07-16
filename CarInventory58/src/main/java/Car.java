import java.util.ArrayList;

public class Car extends CarInventoryController {


    //variables (I thought I needed name for a while so that I could delete by name, but I didn't end up using it.)
    private String name;
    private int id = 0;
    private String make;
    private String model;
    private int year;
    private String color;
    private int miles;


    public Car() {

    }

    public Car(String name, String make, String model, int year, String color, int miles) {

        //this.cars = new ArrayList<Car>();
        this.name = name;
        this.id = 0;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }


    //Methods to call


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }


    //toString method for printing all cars.

    @Override
    public String toString() {
        return "\n" + "| Car Make: " + make + "\n" + "Car Model: " + model + "\n" + "Car Year: " + year + "\n" + "Car Color: " + color + "\n" + "Car Miles: " + miles + "\n" + "\n";
    }

}