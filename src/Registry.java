import java.util.ArrayList;
public class Registry {
    private ArrayList <Employee> workers = new ArrayList<>() ;
    private static Registry instance = null;

    public static Registry getInstance(){
        if(instance==null){
            instance = new Registry();
        }
        return instance;
    }
    public void addWorker(Employee employee) throws EmployeeInRegistryException {
        for (Employee emp: workers) {
            if(emp.equals(employee)){
                throw new EmployeeInRegistryException("Employee is already present in registry::: " + emp.toString());
            }
        }
        workers.add(employee);
    }
    public void printList(){
        for (Employee emp: workers) {
            System.out.println(emp.toString());
        }
    }
}
