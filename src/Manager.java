public class Manager extends Employee{
    private double bonus;

    public Manager(String name, String surname, String departmentName, double salary, int managerID, double bonus) throws IncorrectSalaryException, FieldLengthLimitException {
        super(name, surname, departmentName, salary, managerID);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public String toString(){
        return super.toString() + ", Bonus: " + bonus;
    }
}
