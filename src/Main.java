public class Main {
    public static void main(String[] args){
        try {
            Employee employee = new Employee("Katya", "Novikova", 23000);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

    }
}
