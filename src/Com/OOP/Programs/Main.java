package Com.OOP.Programs;

public class Main {
    public static void main(String[] args) {
        CommissionEmployee cE = new CommissionEmployee("Nkwachi","John", "222222", 500);
        System.out.println(cE.getLastName());
        System.out.println(cE.toString());
        System.out.println(cE.getLastName() +" "+ cE.getFirstName());
    }
}
