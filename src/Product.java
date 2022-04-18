public class Product {
    private String productName;
    private String productDesc;
    private String ID;
    private double cost;

    public Product(String productName, String productDesc, String ID, double cost) {
        this.productName = productName;
        this.productDesc = productDesc;
        this.ID = ID;
        this.cost = cost;

    }

    public Product(String productName, String id, String productName1, String productDesc, double cost) {
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductDesc()
    {
        return productDesc;
    }

    public void setProductDesc(String productDesc)
    {
        this.productDesc = productDesc;
    }

    public String getID()
    {
        return ID;
    }


    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public String toCSVDataRecord()
    {
        return this.productName + "," + this.productDesc + "," + this.ID + "," + this.cost;
    }
}
