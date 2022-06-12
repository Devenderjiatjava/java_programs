//Write a program to accept principal amount,  rat of interest,  no of years from user and calculat rat of interest

import java.util.Scanner;

public class calculation_of_PA_ROI_NOY_ROI

{
    public static void main(String[] args) 
    
    {
        Scanner sc=new Scanner(System.in);

        //principal amount

        System.out.println("Enter principle amount:-");
        double P=sc.nextDouble();

        //rat of interest

        System.out.println("Enter Rate of interest:-");
        double R=sc.nextInt();

        //no of years

        System.out.println("Enter number of years:-");
        double T=sc.nextDouble();

        //calculate the simple interest
        double sim_interest=(P*R*T/100);//Formula of simple interest
        System.out.println("Simple interest is:-"+sim_interest);

    }
}