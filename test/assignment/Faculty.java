import java.util.Calendar;

public class Faculty extends Employee implements Cloneable {
    public  Faculty(){super();}

    public Faculty(String lastname, String firstname, String id, char sex, Calendar birth, FacultyLeve facultyLeve, Education education) {
        super(lastname, firstname, id, sex, birth);
        this.facultyLeve = facultyLeve;
        this.education = education;
    }

    private FacultyLeve facultyLeve;
    private Education education;

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public FacultyLeve getFacultyLeve() {
        return facultyLeve;
    }

    public void setFacultyLeve(FacultyLeve facultyLeve) {
        this.facultyLeve = facultyLeve;
    }

    @Override
    public double monthlyEarning() {
        switch (facultyLeve){
            case AS:
                return FACULTY_MONTHLY_SALARY;
            case AO:
                return 1.2 * FACULTY_MONTHLY_SALARY;
            case FU:
                return 1.4 * FACULTY_MONTHLY_SALARY;
            default:
                return 0;
        }
    }

    @Override
    public String toString(){
        String prefix;
        switch (facultyLeve){
            case AS:
                prefix = "Assistant";
                break;
            case AO:
                prefix = "Associate";
                break;
            case FU:
                prefix = "Full";
                break;
            default:
                prefix = "";
                break;
        }

        return String.format("%s%s Professor\nMonthly Salary:%f\n",super.toString(), prefix, monthlyEarning());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return new Faculty(getLastname(),getFirstname(),getId(),getSex(),getBirthdate(),getFacultyLeve(),getEducation());
    }

    public Object duplicate(){
        try{
            return clone();
        }catch (Exception e){
            return null;
        }
    }
}
