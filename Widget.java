public class Widget {
    private String identifier;
    private String productionDate;
    private double price;
    private String productID;

    public Widget(String identifier, String productionDate, double price){
        String temp = identifier+productionDate;
        super(temp,price);
        this.identifier = identifier;
        this.productionDate=productionDate;
        this.price=price;
    }

    public boolean canReplace(Product temp){
        String[] temparr = temp.getProductID().split("_",0);
        if(temparr[0].compareTo(this.identifier)<0){
            if(temp.getPrice()>this.price){
                return true;
            }
        }
        return false;
    }
}
