public class Main {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.ru", "89231231222", 30000, 30);
        persArray[1] = new Employee("Диана Иванова", "Менеджер", "ivanova@gmail.com", "89999991234", 80000, 25);
        persArray[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@gmail.com", "89231231422", 50000, 28);
        persArray[3] = new Employee("Tinkoff Oleg", "Project Manager", "tinkoff@gmail.com", "89210462117", 100000, 45);
        persArray[4] = new Employee("Koroleva Anna", "QA Engineer", "koroleva@gmail.com", "89231231622", 45000, 29);
        for (Employee employee : persArray) {
            employee.printInfo();
        }

        Park park = new Park("Kids Park");
        park.addAttraction("Roller Coaster", "10:00 - 18:00", 500);
        park.addAttraction("Ferris Wheel", "08:00 - 20:00", 400);

        park.displayAttractions();
    }

}
