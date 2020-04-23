public class Employee {

    private final String name;
    private final String role;
    private final String task;

    public Employee(String name, String role, String task) {
        this.name = name;
        this.role = role;
        this.task = task;
    }

    public void printCurrentTask(){
        Printer printer = Printer.getInstance();
        printer.print("Employee: " + name + "\n" +
                "Role: " + role + "\n" +
                "Task: " + task + "\n");
    }
}