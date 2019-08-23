package lesson1;


public class CarMain {


    public static void main(String[] args) {
        Car carOne = new Car();
        Car carThree = new Car();

        carOne.setYear(8);
        carOne.setColor("Black");
        carOne.setWeight(1700);
        carThree.setYear(8);
        carThree.setColor("Black");
        carThree.setWeight(1700);
        System.out.println(carThree);
    }
}
