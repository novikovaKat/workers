public class Manager extends Employee{
    private double bonus;

    public Manager(String name, String surname, String departmentName, double salary, int managerID, double bonus) throws IncorrectSalaryException, FieldLengthLimitException {
        super(name, surname, departmentName, salary, managerID);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void printEmployee(){
        System.out.printf("Name: %s, Surname: %s, Department: %s, Salary: %f, ID: %d, ManagerID: %d, Bonus: %f\n", name, surname, departmentName, salary, ID, managerID, bonus);
    }
}
