package com.codersbay.gerhofer;

public class rectangle extends shape{

    protected double width;
    protected double length;

    public rectangle() {
        super();
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            width = 1.0;
            length = 1.0;
        }
    }

    public rectangle(double width, double length) {
        super();
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.width  = width;
            this.length = length;
        }
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width  = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return String.format("The Rectangle has a width of = %f and a length of = %f", width, length);
    }
}
