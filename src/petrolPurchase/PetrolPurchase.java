package petrolPurchase;

public class PetrolPurchase {
    String stationLocation;
    String typeOfPetrol;
    int quantity;
    double pricePerLIter;
    double discount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol,
                          int quantity, double pricePerLIter, double discount){

    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public String getStationLocation(){
        return stationLocation;
    }

    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerLIter(double pricePerLIter) {
        this.pricePerLIter = pricePerLIter;
    }

    public double getPricePerLIter() {
        return pricePerLIter;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void purchase(double amount){
        quantity += amount;
    }
    public void amountMinusDiscount(double amount){
        amount -= discount;
    }
    }




