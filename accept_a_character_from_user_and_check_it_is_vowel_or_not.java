//Write a programme to accept a character from user and check it is vowel or not using switch case.

import java.util.Scanner;

public class accept_a_character_from_user_and_check_it_is_vowel_or_not

{
    public static void main(String[] args) 
    
    {
        Scanner sc=new Scanner(System.in);

        System.out.println(" Hi please Enter Any of the Alphabet to check vowel or constant :-");
        char ch=sc.next().charAt(0);

        switch (ch)
        
        {
            case 'a':
                System.out.println("this is a vowel character:"+ch);
                break;
            case 'e':
                System.out.println("this is a vowel character:"+ch);
                break;
            case 'i':
                System.out.println("this is a vowel character:"+ch);
                break;
            case 'o':
                System.out.println("this is a vowel character:"+ch);
                break;
            case 'u':
                System.out.println("this is a vowel character:"+ch);
                break;
            default:
                System.out.println("this is a constant character");
        }

    }
}