public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName = productName;
    }

    public void setProductName(String name){
        this.productName = name;
    }

    public String getName(){
        return productName;
    }

    public String toString(){
        return productName + super.toString();
    }

}