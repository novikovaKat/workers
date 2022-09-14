public class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary;
    private static int nextId = 1;
    private static final int MAX_CHARACTERS = 10;

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.checkLength(name);
        this.name = name;
        this.checkLength(surname);
        this.surname = surname;
        this.checkSalary(salary);
        this.salary = salary;
        this.id = nextId++;
    }

    public void setName(String name) throws FieldLengthLimitException {
        this.checkLength(name);
        this.name = name;
    }

    public void setSurname(String surname) throws FieldLengthLimitException {
        this.checkLength(surname);
        this.surname = surname;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        this.checkSalary(salary);
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getSalary() {
        return this.salary;
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
