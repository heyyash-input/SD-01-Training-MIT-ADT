package Day07.HashSet;

public class Product implements Comparable<Product>{
//----------------------------------------------------------------------------------------------------------------
    private int prdId;
    private String name ;
    private double amount;
//----------------------------------------------------------------------------------------------------------------

    public Product(int prdId, String name, double amount) {
        this.prdId = prdId;
        this.name = name;
        this.amount = amount;
    }

//----------------------------------------------------------------------------------------------------------------

    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
//---------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Product{" +
                "prdId=" + prdId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
//----------------------------------------------------------------------------------------------------------------

    public int compareTo ( Product p){
        if(this.prdId < p.prdId){
            return -1;
        } else if (this.prdId  > prdId) {
            return 1 ;
        }else{
            return 1 ;
        }
    }

    //----------------------------------------------------------------------------------------------------------------
}
