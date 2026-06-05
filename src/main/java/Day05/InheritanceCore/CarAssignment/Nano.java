package Day05.InheritanceCore.CarAssignment;

public class Nano extends Car{
//---------------------------------------------------------------------------------------------------------------
    private String color ;
//---------------------------------------------------------------------------------------------------------------

    public Nano(){
        System.out.println("--------Default Nano Constructor-----");
    }

//--------------------------------------------------------------------------------------------------------------

    //Override
    public void speed(){
        System.out.println("Nano car speed is 80 km/hr");
    }

//---------------------------------------------------------------------------------------------------------------

    public Nano(int carId, String name, double price, String color) {
        super(carId, name, price);
        System.out.println("Nano color is:"  );
        this.color = color;
    }

    //--------------------------------------------------------------------------------------------------------------
}
