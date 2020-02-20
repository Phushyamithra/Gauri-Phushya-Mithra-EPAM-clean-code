package com.mithra.Constuction;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Construction test= new Construction();
        Scanner in=new Scanner(System.in);
        int choice_of_material=in.nextInt();
        double Area = in.nextDouble();
        double final_amt=test.cost(choice_of_material,Area);
    }
}
