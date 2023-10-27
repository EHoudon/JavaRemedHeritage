package src.Form;

import java.util.concurrent.TransferQueue;

public class Triangle extends Form {
    private int size;

    public Triangle(int x, int y, int triangleSize){
        super(x, y);
        this.size = triangleSize;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw a triangle at %1$d,%2$d and with size=%3$d", this.getCoordX(), this.getCoordY(), this.size));
    }

    @Override
    public void move(int x, int y) {
        System.out.println(String.format("%s and I have a specific move", this.toString()));
    }

    @Override
    public String toString() {
        return "I am a Triangle";
    }
}
