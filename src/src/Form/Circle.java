package src.Form;

public class Circle extends Form{

    private int radius;

    public Circle(int x, int y, int circleRadius){
        super(x, y);
        this.radius = circleRadius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw a circle at %1$d,%2$d and with radius=%3$d", this.getCoordX(), this.getCoordY(), this.radius));
    }

    @Override
    public String toString() {
        return "I am a Circle";
    }
}
