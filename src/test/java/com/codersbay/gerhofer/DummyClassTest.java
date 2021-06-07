package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DummyClassTest {

    @Test
    @DisplayName("When we call getAge() on the dummy class we expect it to return 27.")
    public void testGetAge() {
        DummyClass classUnderTest = new DummyClass();
        assertEquals(27, classUnderTest.getAge());
    }

    @Test
    @DisplayName("When we call doNotCall() on the dummy class we expect it to throw an IllegalAccessException")
    public void testDoNotCallThrowsException() {
        DummyClass classUnderTest = new DummyClass();
        assertThrows(IllegalAccessException.class, () -> {
            classUnderTest.doNotCall();
        });
    }



    @Test
    public void rectangleTest() {
        rectangle r1 = new rectangle(1,2);
        assertEquals(r1.getArea(), r1.width * r1.length);
        assertEquals(r1.getPerimeter(), 2 * (r1.width + r1.length));

    }

    @Test
    public void circleTest() {
        circle c1 = new circle(4);
        assertEquals(c1.getArea(), c1.getRadius() * c1.getRadius() * Math.PI);
        assertEquals(c1.getPerimeter(), 2 * c1.getRadius() * Math.PI);
    }

    @Test
    public void squareTest() {
        square s1 = new square(4);
    }

    @Test
    public void CircleIsZero() {
        assertThrows(IllegalArgumentException.class, () ->  {
                    circle r1 = new circle(0);
                }
        );
    }

    @Test
    public void CircleIsNegative() {
        assertThrows(IllegalArgumentException.class, () ->  {
                    circle r1 = new circle(-4);
                }
        );
    }

    @Test
    public void RectangleIsZero() {
        assertThrows(IllegalArgumentException.class, () ->  {
                    rectangle r1 = new rectangle(0,0);
                }
        );
    }

    @Test
    public void RectangleIsNegative() {
        assertThrows(IllegalArgumentException.class, () ->  {
                    rectangle r1 = new rectangle(-1,-5);
                }
        );
    }

}