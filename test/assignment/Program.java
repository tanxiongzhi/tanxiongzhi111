import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Program {
    public static void main(String[] args){
        Employee employees[] = new Employee[9];
        employees[0] = new Staff("Allen","Paita","123",'M',new GregorianCalendar(1959,2,23),50);
        employees[1] = new Staff("Zapata","Steven","456",'F',new GregorianCalendar(1964,7,12), 35);
        employees[2] = new Staff("Rios","Enrique","789",'M',new GregorianCalendar(1970,6,2), 40);
        employees[3] = new Faculty("Johnson","Anne","243",'F',new GregorianCalendar(1962,4,27), FacultyLeve.FU,
                new Education("Ph.D","Engineering",3));
        employees[4] = new Faculty("Bouris","William","791",'F',new GregorianCalendar(1975,3,14), FacultyLeve.AO,
                new Education("Ph.D","English", 1));
        employees[5] = new Faculty("Andrade","Christopher","623",'F',new GregorianCalendar(1980,5,22), FacultyLeve.AS,
                new Education("MS","Physical Education", 0));
        employees[6] = new Partime("Guzman","Augusto","455",'F',new GregorianCalendar(1977,8,10),35,30);
        employees[7] = new Partime("Depirro","Martin","678",'F',new GregorianCalendar(1987,9,15),30,15);
        employees[8] = new Partime("Aldaco","Marque","945",'M',new GregorianCalendar(1988,11,24),20,35);

        System.out.println("a. Display all employees' information.");
        for(int i=0;i<9;i++)
            System.out.println(employees[i].toString());

        // b
        double totalMonthlySalary = 0;
        for(int i=6;i<9;i++)
            totalMonthlySalary += employees[i].monthlyEarning();
        System.out.println("b. Total monthly salary for all the part-time staff is: " + totalMonthlySalary);

        // c
        totalMonthlySalary = 0;
        for(int i= 0;i<9;i++)
            totalMonthlySalary += employees[i].monthlyEarning();
        System.out.println("c. Total monthly salary for all employees is: " + totalMonthlySalary);

        // d
        System.out.println("d. Display all employee descending by id.");
        Arrays.sort(employees);
        for(int i=0;i<9;i++)
            System.out.println(employees[i].toString());

        // e
        System.out.println("e. Display all employee ascending by last name.");
        Arrays.sort(employees, new LastNameComparator());
        for(int i=0;i<9;i++)
            System.out.println(employees[i].toString());

        // f
        System.out.println("f. Duplicate a faculty");
        Faculty faculty = new Faculty("Bouris","William","791",'F',new GregorianCalendar(1975,3,14), FacultyLeve.AO,
                new Education("Ph.D","English", 1));
        Employee dup = (Faculty)faculty.duplicate();
        if(dup == null)
            System.out.println("Duplicate false.");
        else
            System.out.println(dup.toString());
    }
}
