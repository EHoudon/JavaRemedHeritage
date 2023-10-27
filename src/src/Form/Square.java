package src.Form;

public class Square extends Form{
    private int size;

    public Square(int x, int y, int squareSize){
        super(x, y);
        this.size = squareSize;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw a square at %1$d,%2$d and with size=%3$d", this.getCoordX(), this.getCoordY(), this.size));
    }

    @Override
    public String toString() {
        return "I am a Square";
    }
}
