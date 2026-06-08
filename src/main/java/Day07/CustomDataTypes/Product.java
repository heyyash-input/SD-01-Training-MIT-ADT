package Day07.CustomDataTypes;

public class Product {
    private int prdId ;
    private String prdName;
    private double price ;
//----------------------------------------------------------------------------------------------------------------
    public Product() {
        System.out.println("---Default Contsructor----");
    }
//----------------------------------------------------------------------------------------------------------------
    public Product(int prdId, String prdName, double price) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.price = price;
    }
//----------------------------------------------------------------------------------------------------------------
    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public double getAmount() {
        return price;
    }

    public void setAmount(double amount) {
        this.price = amount;
    }

//--------------------------------------------------------------------------------------------------------------
}
