//Write a program to accept length and breath from user and calculate area of rectangle and perimeter of rectangle

import java.util.*;

public class Perimeter_area_Of_Ractangle 

{
    public static void main(String[] args) 
    
    {
        Scanner sc=new Scanner(System.in);

        System.out.println(" Please Enter the length of the rectangle");
        int length=sc.nextInt();

        System.out.println("Please Enter the breath of the rectangle");
        int width=sc.nextInt();


        //calculate area of rectangle
        int  area_Of_Rec=(length*width);
        System.out.println("The area of rectangle is:-  "+area_Of_Rec);

       
       //calculate the perimeter of rectangle
        int Parameter_rec=(length+width);
        System.out.println("The perimeter of rectangle is:-  "+Parameter_rec);

    }
}