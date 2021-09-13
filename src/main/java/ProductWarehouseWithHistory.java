public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history(){
        return history +"";
    }

    public void addToWarehouse(double amount){
        history.add((this.getBalance() + amount));
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount){
        history.add((this.getBalance() - amount));
        return super.takeFromWarehouse(amount);

    }
}
