public class Employee {
    protected String name;
    protected String surname;
    protected String departmentName;
    protected double salary;
    protected int ID;
    protected int managerID;
    private static int nextId = 1;
    private static final int MAX_CHARACTERS = 10;


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
    }

    public void printEmployee(){
        System.out.printf("Name: %s, Surname: %s, Department: %s, Salary: %f, ID: %d, ManagerID: %d\n", name, surname, departmentName, salary, ID, managerID);
    }

    private void checkLength(String namePart) throws FieldLengthLimitException {
        if (namePart != null && namePart.length() > MAX_CHARACTERS) {
            throw new FieldLengthLimitException("Too many characters in \"" + namePart +  "\". Length of name/surname field must be <" + MAX_CHARACTERS);
        }
    }

    private void checkSalary(double salary) throws IncorrectSalaryException {
        if (salary < 0.0) {
            throw new IncorrectSalaryException("Negative value for salary. Value = " + salary);
        }
    }

}
