//Write a program to accept selling price and cost price for user and find out profit or loss.

import java.util.Scanner;

public class S_price_AND_C_price_for_user_and_find_out_profit_or_loss

{

    public static void main(String[] args) 
    
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the selling price of Product:- ");
        int sel_price=sc.nextInt();

        System.out.println("Enter the cost price of Product:- ");
        int cost_price=sc.nextInt();


        if(sel_price==cost_price)
        
        {
            System.out.println("**Neither profit nor loss**");
        }

        else if(sel_price>cost_price)
        {
            System.out.println("*You have profit :-*"+(sel_price-cost_price));
        }

        else 
        {
            System.out.println("=you have loss="+(cost_price-sel_price));
        }
    }
}