package ChapterThree;
public class TargetHeartRateCalculator {
    private String firstName;
    private String lastName;
    private int bDay, bMonth, bYear;

    public TargetHeartRateCalculator(String firstName, String lastName, int bDay, int bMonth, int bYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.bYear = bYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getbDay() {
        return bDay;
    }

    public void setbDay(int bDay) {
        this.bDay = bDay;
    }

    public int getbMonth() {
        return bMonth;
    }

    public void setbMonth(int bMonth) {
        this.bMonth = bMonth;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }
    public String getDOB() {
        return String.format("%d/%d/%d", bDay, bMonth, bYear);
    }
    // calculate and return person's age
    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - bYear;
    }
    // calculate and return max heartrate
    public int getMaxHeartRate() {
        // max heartrate in bpm = 220 - age in years.
        return 220 - getAge();
    }
    // calculate and return target heartrate
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
}