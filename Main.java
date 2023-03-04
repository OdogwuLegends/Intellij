public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);

        myCar.display();
        myCar.accelerate();
        myCar.display();
        myCar.brake();
        myCar.display();
    }
}
