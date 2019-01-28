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


import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        // write your code here
        Calculator newCalc = new Calculator();
        Calculator triangleCalc = new Calculator();
        Calculator newCalc1 = new Calculator();

        Scanner newScan = new Scanner(System.in);
        Scanner scanNew = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int tryAgain;
        int whichShape;
        do {
            do {
                System.out.println("Press [1] to build a Triangle \n Press [2] to Build a Square or Rectangle \n Press [3] for Circle \n Press [4] for Trapezoid");
                whichShape = newScan.nextInt();
                if (whichShape < 1 || whichShape > 4) {
                    System.out.println(" Try again Please enter 1-3");
                } else
                    switch (whichShape) {
                        case 1:
                            System.out.println("Please Enter the Base dimensions of your Triangle");
                            double baseNum = scanNew.nextDouble();
                            System.out.println("Please Enter the Height of your Triangle ");
                            double triHeight = scanNew.nextDouble();
                            System.out.println("The Area of your Triangle is " + newCalc.calculateTriangle(triHeight, baseNum) + "\n\n");
                            break;

                        case 2:
                            System.out.println("Please enter the Shape you want to build \n Square or Rectangle");
                            String shapeName = scanner.nextLine();
                            System.out.println("Please enter the Length of your shape");
                            Double shapeLength = newScan.nextDouble();
                            System.out.println(("Please Enter Your shapes Height"));
                            System.out.println("\n The area of your shape is " + triangleCalc.calculateArea(shapeName, shapeLength, scanNew.nextDouble()) + "\n\n");
                            break;

                        case 3:
                            System.out.println("Please Enter the Radius of your Circle");
                            double cirRadius = scanNew.nextDouble();
                            newCalc1.calculateCircle(cirRadius);
                            break;
                        case 4:
                            System.out.println("Please Enter the Base1 dimensions of your Trapezoid");
                            double trapBase1 = scanNew.nextDouble();
                            System.out.println("Please Enter the Base2 of your Triangle ");
                            double trapBase2 = scanNew.nextDouble();
                            System.out.println("Please enter the Height of your Trapezoid");
                            double trapHeight = scanNew.nextDouble();
                            System.out.println("The Area of your Trapezoid is " + newCalc1.trapazoid(trapBase1, trapBase2, trapHeight) + "\n\n\n");
                            break;

                    }


            } while (whichShape < 1 || whichShape > 4);

            System.out.println("Do you want to build another Shape \n [1] For yes \n [2] For no");
            tryAgain = newScan.nextInt();

        } while (tryAgain == 1);
    }


}


