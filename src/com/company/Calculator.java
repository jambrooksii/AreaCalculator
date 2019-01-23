package com.company;

public class Calculator {

    private double base;
    private double height;

    public double calculateArea(double length, double width, String shaped) {
        if (shaped.toLowerCase().equals("rectangle")) {
            double rectangle = length * width;
            return rectangle;
        } else if (shaped.toLowerCase().equals("square")) {
            double square = length * length;
            return square;
        }


        return -1;
    }

    public double calculateTriangle(double width, double base, String shape1){
        double triArea = (base / 2) * width;
        return triArea;
    }

public void setBase(double baseSet){
        base = baseSet;
}
public double getBase(){
        return base;
}

public void setHeight(double heightSet){
        height = heightSet;
}
public double getHeight(){
        return height;
}

}




