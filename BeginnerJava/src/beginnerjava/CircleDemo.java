package beginnerjava;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {

        double radius, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        radius = input.nextDouble();

        area = 3.1416 * radius * radius;
        System.out.println("Area of Circle: "+area);
    }
}
