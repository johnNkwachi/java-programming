package Com.OOP.Programs;

public class CommissionEmployee extends Employee{
    private double commission;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commission) {
        super(firstName, lastName, socialSecurityNumber);
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "commission=" + commission +
                '}';
    }
}
