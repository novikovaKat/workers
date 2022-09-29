public class Main {
    public static void main(String[] args){
        Registry registry = Registry.getInstance();
        try {
            Employee emp1 = new Employee("Diana", "Koval", "Kyiv", 30000,3 );
            Employee emp2 = new Employee("Sasha", "Brown", "Lviv", 25900, 3);
            Employee emp3 = new Manager("Denis", "Korchynskyi", "Lviv", 32000, 3, 234);
            Employee emp4 = new Employee("Sasha", "Brown", "Kyiv", 17900, 3);


            registry.addWorker(emp1);
            registry.addWorker(emp2);
            registry.addWorker(emp3);
            //registry.addWorker(emp4);

            registry.printList();
        }
        catch (FieldLengthLimitException | IncorrectSalaryException | EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

    }
}
