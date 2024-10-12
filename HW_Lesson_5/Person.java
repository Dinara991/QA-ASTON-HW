public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    // конструктор 
    public Person(String name,String position, String email, 
String phone,double salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
   }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);

    }
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.ru", "89231231222", 30000, 30);
        persArray[1] = new Person("Диана Иванова", "Менеджер", "ivanova@gmail.com", "89999991234", 80000, 25);
        persArray[2] = new Person("Sidorov Sidr", "Developer", "sidorov@gmail.com", "89231231422", 50000, 28);
        persArray[3] = new Person("Tinkoff Oleg", "Project Manager", "tinkoff@gmail.com", "89210462117", 100000, 45);
        persArray[4] = new Person("Koroleva Anna", "QA Engineer", "koroleva@gmail.com", "89231231622", 45000, 29);
        for (Person person : persArray) {
            person.printInfo();
        }
    }
}
