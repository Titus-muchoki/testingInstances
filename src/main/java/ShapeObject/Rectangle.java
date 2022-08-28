package ShapeObject;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    private int mLength;
    private int mWidth;

    private static List<Rectangle> instances = new ArrayList<>();

    public Rectangle(int length, int width) {
        mLength = length;
        mWidth = width;
        instances.add(this);

    }

    public static void main(String[] args){

    }

    public static List <Rectangle> all() {
        return instances;
    }
}