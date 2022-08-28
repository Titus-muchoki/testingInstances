package ShapeObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
   public void returns_allInstancesOf_True() {
    Rectangle firstRectangle = new Rectangle(10, 5);
    Rectangle secondRectangle = new Rectangle(12, 12);
    assertTrue(Rectangle.all().contains(firstRectangle));
    assertTrue(Rectangle.all().contains(secondRectangle));
    }
}