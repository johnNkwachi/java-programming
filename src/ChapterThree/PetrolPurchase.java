package ChapterThree;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;



    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        return quantity * pricePerLiter - percentageDiscount;
    }
}


//    instance variables—the station’s location (type String ), the type of petrol (type String ), the quan-
//        tity (type int ) of the purchase in liters, the price per liter ( double ), and the percentage discount
//        ( double ). Your class should have a constructor that initializes the five instance variables. Provide a
//        set and a get method for each instance variable. In addition, provide a method named getPurchase-
//        Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
//        minus the discount, then returns the net amount you had to pay as a double value. Write an appli-
//        cation class named Petrol that demonstrates the capabilities of class PetrolPurchase .