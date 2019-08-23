package homeWork.lesson1;

public class Triangle {
    private float side;
    private float height;

    public Triangle(float side, float height) {
        super();
        this.side = side;
        this.height = height;
    }

    public float square() {
        float result = (1f / 2f) * (side * height);
        return result;
    }

    public Triangle() {
        super();
    }

    @Override

    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
