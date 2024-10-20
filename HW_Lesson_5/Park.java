import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double price) {
        this.attractions.add(new Attraction(name, workingHours, price));
    }

    public void displayAttractions() {
        System.out.println("Park: " + name);
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingTime;
        private double price;

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

}
