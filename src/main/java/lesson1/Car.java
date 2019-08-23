package lesson1;

public class Car {
    private int year;
    private String color;
    private double weight;
    private double velosity;

    public Car(String color, int year, double weight) {
        super();
        this.year = year;
        this.color = color;
        this.weight = weight;
    }

    public Car() {
        super();
    }

    public void beep() {
        System.out.println("Beep Beep");
    }

    public void acceleration(double a) {
        velosity = velosity + a;
    }

    public double getVelosity() {
        return velosity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", velosity=" + velosity +
                '}';
    }

    public void declaration(double b) {
        if (velosity - b >= 0) {
            velosity = velosity - b;
        }
    }
}