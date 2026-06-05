package Day05.InheritanceCore.CarAssignment;

public class Car {
//---------------------------------------------------------------------------------------------------------------
    private int carId ;
    private String name;
    private double price;
//---------------------------------------------------------------------------------------------------------------

    public void speed(){
        System.out.println("Speed is 60 km/hr");
    }

//---------------------------------------------------------------------------------------------------------------

    public Car(){
        System.out.println("Default Constructor");
    }

//---------------------------------------------------------------------------------------------------------------

    public Car(int carId, String name, double price) {
        this.carId = carId;
        this.name = name;
        this.price = price;
    }

//---------------------------------------------------------------------------------------------------------------

    //Object class toString()
    // toString() get called implicitly
    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//---------------------------------------------------------------------------------------------------------------

    public void display(){
        System.out.println("Car Display is" + carId + " "+ name + " "+ price );
    }

//---------------------------------------------------------------------------------------------------------------

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//---------------------------------------------------------------------------------------------------------------

}
