package mobilFillingStation;

import java.util.Scanner;
public class MobilFillingStationDiscount{
    private String name;
    private final int priceperliter = 200;
    private int liter;

    public MobilFillingStationDiscount(String name, int liter){
        this.name = name;
        this.liter = liter;
    }
    public void setName(String name){
        this.name = name;
    }
        public String getname(){

        return name;

        }
        public void setLiter(int liter){
        this.liter = liter;
        }
    public int getLiter(){
        return liter;
    }
    public int percentage (){
        int percentage = ( priceperliter * liter);
        int cal = (percentage * liter )/ 100;
        int amount = (percentage * liter)/ cal;
        System.out.printf("cost in %s filling station is  %d, naira", name, amount);
        return amount;
    }
}

