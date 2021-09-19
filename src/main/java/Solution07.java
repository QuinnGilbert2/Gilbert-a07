import java.util.*;
public class Solution07 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double feet_to_meters = 0.09290304;
        System.out.print("What is the length of the room in feet?");
        double length = in.nextDouble();
        System.out.print("What is the width of the room in feet?");
        double width = in.nextDouble();
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
        double area = length*width;
        System.out.println("The area is "+area+" square feet,");
        double square_meters = area*feet_to_meters;
        System.out.println("or "+square_meters+" square meters");

    }

}
