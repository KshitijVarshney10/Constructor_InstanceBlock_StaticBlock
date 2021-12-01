/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box.
Create an object of the Box class and test the functionalities.     */


import java.util.Scanner;

public class Box {
    private static double width;
    private static double height;
    private static double depth;

    public Box(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    public double volume(){
        return width*height*depth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter width:");
        width=sc.nextDouble();
        System.out.println("Enter height:");
        height=sc.nextDouble();
        System.out.println("Enter depth:");
        depth=sc.nextDouble();

        Box obj=new Box(width,height,depth);
        System.out.println("Volume of the box is: "+obj.volume());
    }
}
