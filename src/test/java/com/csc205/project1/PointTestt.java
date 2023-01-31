package com.csc205.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTestt {

    private Point p2 = new Point(3,4);

    @Test
    void getX() {
    }

    @Test
    void setX() {
    }

    @Test
    void getY() {
    }

    @Test
    void setY() {
    }

    @Test
    void setPoint() {
    }

    @Test
    void shiftX() {
        Point p33 = new Point(3,4);
        Point p44 = new Point(1, 4);
        p44.shiftX(2);
        double expected = p33.getX();
        double actual  = p44.getX();
        assertEquals(expected,actual);

    }

    @Test
    void shiftY() {
        Point p11 = new Point(3,4);
        Point p22 = new Point(3, 2);
        p22.shiftY(2);
        double expected = p11.getY();
        double actual  = p22.getY();
        assertEquals(expected,actual);
    }

    @Test
    void distance() {
        double expected = 5.0;
        double actual = new Point().distance(p2);
        assertEquals(expected,actual);

    }

    @Test
    void rotate() {
        Point p66 = new Point(3, 5);
        p66.rotate(Math.PI);
        Point expected = new Point(-3,-5);

       assertEquals(Math.round(expected.getX()), Math.round(p66.getX()));
       assertEquals(Math.round(expected.getY()), Math.round(p66.getY()));
    }

    @Test
    void testToString() {
    }
}