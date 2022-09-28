public class Employee {
    protected String name;
    protected String surname;
    protected String departmentName;
    protected double salary;
    protected int ID;
    protected int managerID;
    private static int nextId = 1;
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
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Surname: " + surname + ", Department: " + departmentName + ", Salary:" + salary + ", ID: " + ID + ", ManagerID: " + managerID;
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
    public boolean equalToEmployee(Employee employee){
        return employee != null && name.equals(employee.getName()) && surname.equals(employee.getSurname()) && departmentName.equals(employee.departmentName) && Double.compare(salary, employee.getSalary()) == 0;
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

}
