import java.util.Calendar;
import java.util.Comparator;

/*
    Represent Employee information.
 */
public abstract class Employee implements EmployeeInfo, Comparable<Employee> {

    public Employee(){}
    public Employee(String lastname, String firstname, String id, char sex, Calendar birth){
        setLastname(lastname);
        setFirstname(firstname);
        setId(id);
        setSex(sex);
        setBirthdate(birth);
    }

    private String lastname;
    private String firstname;
    private String id;
    private char sex;
    private Calendar birthdate;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Calendar birth_date) {
        this.birthdate = birth_date;
    }

    public  abstract  double monthlyEarning();

    @Override
    public String toString(){
        return String.format("ID Employee number: %s\nEmployee name: %s %s\nBirth date: %s\n", getId(), getFirstname(),getLastname(), birthdate.getTime().toString());
    }

    @Override
    public int compareTo(Employee o) {
        return -id.compareTo(o.getId());
    }


}
