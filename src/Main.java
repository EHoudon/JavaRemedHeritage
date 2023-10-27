import src.Form.Circle;
import src.Form.Form;
import src.Form.Square;
import src.Form.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Form> formList = new ArrayList<Form>();
        formList.add(new Square(10, 10, 100));
        formList.add(new Circle(20, 20, 50));
        formList.add(new Triangle(30, 30, 70));

        for(int i=0; i != formList.size(); ++i){
            formList.get(i).draw();
        }

        for(int i=0; i != formList.size(); ++i){
            formList.get(i).move(20,20);
        }
    }
}