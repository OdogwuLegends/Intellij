public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public void accelerate() {
        this.speed += 10;
    }

    public void brake() {
        if (this.speed >= 10) {
            this.speed -= 10;
        } else {
            this.speed = 0;
        }
    }

    public void display() {
        System.out.println(this.year + " " + this.make + " " + this.model);
        System.out.println("Speed: " + this.speed + " mph");
    }
}


