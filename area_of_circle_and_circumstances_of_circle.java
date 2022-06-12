//Write a program to accept radius from user and find out the area of circle and circumstances of circle
import java.util.Scanner;

public class area_of_circle_and_circumstances_of_circle

{
    public static void main(String[] args) 
   
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hi Please Enter the value for radius of the circle:");
        float r=sc.nextFloat();

        //Area Of Circle
        double Area=(3.14*r*r); // formula for calculate area of circle
        System.out.println("Area of the circle is :-"+Area);

        //Circumstances Of Circle
        double circum=(2*3.14*r); //formula for calculate circumstances of circle
        System.out.println("Circumstances of circle is :-"+circum);

    }
}