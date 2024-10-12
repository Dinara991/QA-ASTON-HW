public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    // конструктор 
    public Employee(String name,String position, String email, 
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
        Employee employee1 = new Employee("Диана Иванова", "Менеджер", "ivanova@gmail.com", "+7-999-999-1234", 80000, 25);
        employee1.printInfo();
    }
}
