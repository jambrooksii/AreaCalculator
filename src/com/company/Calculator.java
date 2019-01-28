package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Calculator {

    private double base;
    private double height;

    public double calculateArea(String shaped, double length, double width) {
        if (shaped.toLowerCase().equals("rectangle")) {
            double rectangle = length * width;
            return rectangle;
        } else if (shaped.toLowerCase().equals("square")) {
            double square = length * length;
            return square;
        }


        return -1;
    }

    public double calculateTriangle(double height, double base) {
        double triArea = (base / 2) * height;
        return triArea;
    }

    public void calculateCircle(double radius) {
        double diameter = radius * 2;
        double circumfrence = diameter * Math.PI;
        double circleArea = (radius * radius) * Math.PI;

        System.out.println("Your circle Diameter is " + diameter + " \n\n Your circles circumfrence is " + circumfrence
                + " \n\n Your circle area is " + circleArea + "\n\n");
    }

    public double trapazoid(double base1, double base2, double height1){
        double trapArea = ((base1 + base2)/2)*height1;
        return trapArea;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}




