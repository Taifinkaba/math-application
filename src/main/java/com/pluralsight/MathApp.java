package com.pluralsight;

public class MathApp {
    static void main() {
        // step 1: using code to find answers

        // 2 variable to represent the salary of 2 people
        int bobSalary =50000;
        int garySalary= 48000;

        // variable to check who has the highest salary
        int highestSalary=Math.max(bobSalary, garySalary);

        // print out highest salary
        System.out.println("The highest salary is " + highestSalary);

        // finding and displaying the smallest variable
        int carPrice = 60000;
        int truckPrice = 90000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        // area of a circle
        double radius = 7.25;
        // Math.pow is a method for "power of" first param is number you want to assign
        // second is the power you want to assign it
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle is " + area);

        // square root
        double num = 5.0;
        // sqrt = pass a number in to get the square root of it
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root is " + squareRoot);

        // display the distance of 2 points
        double x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        // PEMDAS style, first get the "power of" then combine the outcome and find square root
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1,2));
        System.out.println("The distance between (5, 10) and (85, 50) is " + distance);

        // Absolute Value
        double negNum = -3.8;
        double absValue = Math.abs(negNum);
        System.out.println("The absolute value is " + absValue);

        // Random Number
        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);

        // Minutes and Milliseconds in 24 days
        long days = 24, hoursPerDay = 24, minutesPerHour = 60, secondsPerMinute = 60, millisecondsPerSecond = 1000;
        long totalMinutes = days * hoursPerDay * minutesPerHour;
        System.out.println("The total minutes in 24 days is " + totalMinutes);

        // Bonus
        long totalMilliseconds = totalMinutes * secondsPerMinute * millisecondsPerSecond;
        System.out.println("The total milliseconds in 24 days is " + totalMilliseconds);


    }
}
