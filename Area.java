import java.util.Scanner;

class Area {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int length;
        int breadth;
        double area;
        double perimeter;
        double radius;
        double carea;
        double fcircle;

        System.out.println("Enter Length in cm:");
        length = s.nextInt();
        System.out.println("Enter Breadth in cm:");
        breadth = s.nextInt();

        area = length * breadth;
        System.out.println("The area of Rectangle: " + area);

        perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        
        System.out.println("Enter Diameter in cm:");
        double diameter = s.nextDouble();

        
        radius = diameter / 2;
        System.out.println("Radius of the circle: " + radius);

        
        carea = 3.14 * (radius * radius);
        System.out.println("The area of the circle: " + carea);

        
        fcircle = area / carea;
        System.out.println("The number of circles that fit: " + fcircle);
    }
}
