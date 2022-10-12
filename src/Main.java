public class Main {
    public static void main(String[] args) throws EmployeeInRegistryException, IncorrectSalaryException, FieldLengthLimitException {
        Registry registry = Registry.getInstance();

        Employee CEO = new Manager("Diana", "Koval", "Kyiv", 30000,0 , 3600);
        Employee headMarketing = new Manager("Anna", "Brown", "Lviv", 25900, 0, 1740);
        Employee headDeveloping = new Manager("Denis", "Korchynskyi", "Kyiv", 32000, 0, 2340);
        Employee employee1 = new Employee("Kateryna", "Semenova", "Lviv", 17900, 1);
        Employee employee2 = new Employee("Maryna", "Danilova", "Kyiv", 23000, 2);
        Employee employee3 = new Employee("Stanislav", "Soroka", "Kyiv", 21000, 2);
        Employee employee4 = new Employee("Roman", "Terletskyi", "Lviv", 18900, 1);

        registry.addWorker(CEO);
        registry.addWorker(headMarketing);
        registry.addWorker(headDeveloping);
        registry.addWorker(employee1);
        registry.addWorker(employee2);
        registry.addWorker(employee3);
        registry.addWorker(employee4);

       // registry.printList();

        CEO.addSubordinates(headMarketing);
        CEO.addSubordinates(headDeveloping);
        headMarketing.addSubordinates(employee1);
        headMarketing.addSubordinates(employee4);
        headDeveloping.addSubordinates(employee2);
        headDeveloping.addSubordinates(employee3);

        System.out.println(CEO);

        for (Employee subordinate : CEO.getSubordinates()) {
            System.out.println(subordinate);

            for (Employee employee : subordinate.getSubordinates()) {
                System.out.println(employee);
            }
        }


    }
}
