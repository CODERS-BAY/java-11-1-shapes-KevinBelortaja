package com.codersbay.gerhofer;

public class circle extends shape {

    private double radius;

    public circle() {
        super();
        if (radius <= 0) {
            throw new IllegalArgumentException();
        } else {
            radius = 1;
        }
    }

    public circle(double radius) {
        super();
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.radius = radius;
        }
    }


    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        if (radius <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("The circle has a radius of = %f", radius);
    }


}
