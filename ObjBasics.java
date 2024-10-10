public class ObjBasics {
    public static void main(String[] args) {
        Car car1 = new Car(4, 5, 6, "Maruti");
        System.out.println(car1.name);
        System.out.println(car1.noOfWheels);
        System.out.println(car1.noOfSeats);
        System.out.println(car1.noOfDoors);
        System.out.println("********************");
        Car car2 = new Car(4, 5, 6, "S");
        System.out.println(car2.name);
        System.out.println(car2.noOfWheels);
        System.out.println(car2.noOfSeats);
        System.out.println(car2.noOfDoors);
    }
}

class Car {
    int noOfWheels;
    int noOfDoors;
    int noOfSeats;
    String name;

    Car(int noOfWheels, int noOfDoor, int noOfSeats, String name) {
        this.noOfWheels = noOfWheels;
        noOfDoors = noOfDoor;
        this.noOfSeats = noOfSeats;
        this.name = name;
    }
}
