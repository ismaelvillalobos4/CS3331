public class Main {

    public static void main(String[] args) {
        Employee ismael = new Employee("Ismael",
                "CEO",
                "Making excutive decisions");
        Employee ithalia = new Employee("Ithalia",
                "Consultant",
                "Consuting the company");
        Employee miguel = new Employee("Miguel",
                "Salesmen",
                "Selling the company's products");
        Employee derek = new Employee("Derek",
                "Developer",
                "Developing the latest mobile app.");

        ismael.printCurrentTask();
        ithalia.printCurrentTask();
        miguel.printCurrentTask();
        derek.printCurrentTask();
    }
}