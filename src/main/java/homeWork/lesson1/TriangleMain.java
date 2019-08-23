package homeWork.lesson1;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle();
        Triangle triangleTwo = new Triangle();

        triangleOne.setSide(2);
        triangleOne.setHeight(2);
        System.out.println(triangleOne);
        System.out.println(triangleOne.square());

        triangleTwo.setSide(3);
        triangleTwo.setHeight(3);
        System.out.println(triangleTwo);
        System.out.println(triangleTwo.square());

    }
}
