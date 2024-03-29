package homeWork.lesson1;

public class Cat {
    private String color;
    private int year;
    private double weight;

    public Cat(String color, int year, double weight) {
        super();
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void voice(String voice) {
        System.out.println(voice);
    }
}
