package Day08.Shop;

public class Product {
//-------------------------------------------------------------------------------------------------------------------
    private int prdsId ;
    private String name ;
    private double quantity;
//-------------------------------------------------------------------------------------------------------------------
    public Product(int prdsId, String name, double quantity) {
        this.prdsId = prdsId;
        this.name = name;
        this.quantity = quantity;
    }
//-------------------------------------------------------------------------------------------------------------------
    public int getPrdsId() {
        return prdsId;
    }

    public void setPrdsId(int prdsId) {
        this.prdsId = prdsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
//-------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Product{" +
                "prdsId=" + prdsId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    //-------------------------------------------------------------------------------------------------------------------
}
