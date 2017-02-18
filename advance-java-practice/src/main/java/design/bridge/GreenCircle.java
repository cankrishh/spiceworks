package design.bridge;

/**
 * Created by omprakash.yadav on 11/03/16.
 */
public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
