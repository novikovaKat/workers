public class Main {
    public static void main(String[] args){
        /*try {
            Employee employee = new Employee("Katya", "Novikovaaaaaaaaaa", 23000);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }
*/
        try {
            Employee emp1 = new Employee("Katya", "Novikova", "Kyiv", -30000,1 );
            Employee emp2 = new Employee("Sasha", "Brown", "Lviv", 25900, 2);
            Employee emp3 = new Manager("Denis", "Korchynskyi", "Lviv", 32000, 1, 234);
            Registry registry = Registry.getInstance();
            registry.addWorker(emp1);
            registry.addWorker(emp2);
            registry.addWorker(emp3);
            registry.toStringList();
        }
        catch (FieldLengthLimitException|IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }


    }
}
