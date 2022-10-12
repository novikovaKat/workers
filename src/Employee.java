import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    protected String name;
    protected String surname;
    protected String departmentName;
    protected double salary;
    protected List<Employee> subordinates;
    protected int ID;
    protected int managerID;
    private static int nextId = 0;
    private static final int MAX_CHARACTERS = 15;


    public Employee(String name, String surname, String departmentName, double salary, int managerID) throws FieldLengthLimitException, IncorrectSalaryException {
        checkLength(name);
        this.name = name;
        checkLength(surname);
        this.surname = surname;
        this.departmentName = departmentName;
        checkSalary(salary);
        this.salary = salary;
        this.managerID = managerID;
        this.ID = nextId;
        nextId++;
        subordinates = new ArrayList<>();
    }

    public void addSubordinates(Employee e){
        subordinates.add(e);
    }

    public void removeSubordinates(Employee e){
        subordinates.remove(e);
    }

    private void checkLength(String namePart) throws FieldLengthLimitException {
        if (namePart != null && namePart.length() > MAX_CHARACTERS) {
            throw new FieldLengthLimitException("Too many characters in \"" + namePart + "\". Length of name/surname field must be <" + MAX_CHARACTERS);
        }
    }

    private void checkSalary(double salary) throws IncorrectSalaryException {
        if (salary < 0.0) {
            throw new IncorrectSalaryException("Negative value for salary. Value = " + salary);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public int getManagerID() {
        return managerID;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return getClass().toString() + "::: Name: " + name + ", Surname: " + surname + ", Department: " + departmentName + ", Salary:" + salary + ", ID: " + ID + ", ManagerID: " + managerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
