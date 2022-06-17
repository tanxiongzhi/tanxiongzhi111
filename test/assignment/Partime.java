import java.util.Calendar;

public class Partime extends Staff{
    public Partime(){}

    public Partime(String lastname, String firstname, String id, char sex, Calendar birth, double hourlyRate, int hoursWeek) {
        super(lastname, firstname, id, sex, birth, hourlyRate);
        this.hoursWeek = hoursWeek;
    }

    private  int hoursWeek;

    public int getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    @Override
    public double monthlyEarning() {
        return getHourlyRate() * hoursWeek;
    }

    @Override
    public String toString(){
        return String.format("ID Employee number: %s\nEmployee name: %s %s\nBirth date: %s\nHours works per month:%d\nMonthly Salary:%f\n", getId(), getFirstname(),getLastname(), getBirthdate().getTime().toString(), hoursWeek, monthlyEarning());
    }
}
