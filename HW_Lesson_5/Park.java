public class Park {
    public class Attraction {
        private String name;        
        private String workingTime; 
        private double price;      

        // Конструктор 
        public Attraction(String name, String workingTime, double price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }
        
        public void printInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingTime);
            System.out.println("Price: " + price + " руб.");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10:00 - 18:00", 500);
        Park.Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "08:00 - 20:00", 400);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
    }
}
