package com.codersbay.gerhofer;

public abstract class shape {

    private String color;
    private boolean isFilled;

    public abstract double getArea();
    public abstract double getPerimeter();

    public shape() {}

    public shape(String color, boolean filled) {
        this.color  = color;
        this.isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return isFilled;
    }
    public void setFilled(boolean filled) {
        this.isFilled = filled;
    }

}
