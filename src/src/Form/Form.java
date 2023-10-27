package src.Form;

public abstract class Form {
    private int coordX;
    private int coordY;

    protected Form(int x, int y) {
        this.coordX = x;
        this.coordY = y;
    }

    public abstract void draw();

    public void move(int x, int y){
        this.coordX += x;
        this.coordY += y;

        System.out.println(String.format("Move form: %s", this.toString()));
    }

    protected int getCoordX(){
        return this.coordX;
    }

    protected int getCoordY(){
        return this.coordY;
    }
}
