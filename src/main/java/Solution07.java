/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution07 {
    /*
    prompt length
    input length
    prompt width
    input width
    create area in feet
    area = length*width
    create constant conversion rate
    area in meters = area*conversion
    print areas in both feet and meters
    create constant conversion
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the room in feet?");
        double length = in.nextDouble();
        System.out.print("What is the width of the room in feet?");
        double width = in.nextDouble();
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
        double area = length*width;
        System.out.println("The area is "+area+" square feet,");
        final double feet_to_meters = 0.09290304;
        double square_meters = area*feet_to_meters;
        System.out.println("or "+square_meters+" square meters");

    }

}
