package com.codersbay.gerhofer;

public class square extends rectangle {


    public square() {
        super();
    }

    public square(double side) {
        super(side, side);
    }

    public square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return String.format("The Square has a length of = %f", width);
    }

}
