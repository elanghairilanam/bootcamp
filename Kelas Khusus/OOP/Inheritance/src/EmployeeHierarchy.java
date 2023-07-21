public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee employee = new Employee("Jhon Doe",35, 50000);
        Manager manager = new Manager("Jane Smith", 35,80000,"Operations");
        Staff staff = new Staff("Mike Jhonson",25,30000,"IT");

        employee.displayInformation();
        System.out.println();
        manager.displayInformation();
        System.out.println();
        staff.displayInformation();
    }
}
