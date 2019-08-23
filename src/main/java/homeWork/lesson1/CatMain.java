package homeWork.lesson1;

public class CatMain {


    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Cat catThree = new Cat();

        catOne.setColor("Grey");
        catOne.setWeight(11.1);
        catOne.setYear(1);
        catOne.voice("Meow");

        catTwo.setColor("Black");
        catTwo.setWeight(13.3);
        catTwo.setYear(3);
        catTwo.voice("Meow!!-MEOW");

        catThree.setColor("White");
        catThree.setWeight(12.4);
        catThree.setYear(4);
        catThree.voice("Meow!!-MEOW - !!MEOW");


        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);

    }
}
