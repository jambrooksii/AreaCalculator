package com.company;


        /*• Create a new project in IntelliJ named AreaCalculator using the Command Line App template
        • Initialize your project as a Git repository and be sure to add and commit all changes as you work
        • Rename your CalculatorDemo file to CalculatorDemo (right-click -> Refactor -> Rename...)
        • Create a new Java class file (File -> New -> Java Class) named Calculator
        • Your Calculator should have (2) properties: width and height (with accessor methods)
        • Your Calculator should have a method named calculateArea() which:

        • Accepts width and height as parameters
        • Calculates the area of the rectangle
        • Returns the area

        • In your CalculatorDemo, create an instance of Calculator and test your calculateArea() method
        • Bonus: Modify your program so that your calculator has a shape property, and modify calculateArea() to
        accept shape, width, and height. Your method should then calculate the area of the shape depending on
        whether the shape parameter is “triangle” or “rectangle”, and should return the area
        */

public class CalculatorDemo {

    public static void main(String[] args) {
        // write your code here
        Calculator newCalc = new Calculator();
        Calculator triangleCalc = new Calculator();
        Calculator newCalc1 = new Calculator();

        triangleCalc.setBase(12.3);
        triangleCalc.setHeight(15.5);




        System.out.println(newCalc.calculateArea(4, 6, "rectangle"));
        System.out.println(newCalc1.calculateTriangle(5, 7, "triangle"));
      //  System.out.println((triangleCalc.getBase() /2) * triangleCalc.getHeight());

    }

}
