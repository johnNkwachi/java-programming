package ChapterThree;

public class FuelStation {

    private String location;
    private String fuel;
    private int quantity;
    private double pricePerLiter;
    private double discount;
    private double discountPrice;

    public FuelStation(String location, String fuel, int quantity, double pricePerLiter, double discount) {
        this.location = location;
        this.fuel = fuel;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void calculateDiscount(double discountPrice) {
        discountPrice = quantity * pricePerLiter * (discount / 100);
    }

    public double getPurchaseAmount(){
      return (quantity * pricePerLiter) - discountPrice;
    }
}
