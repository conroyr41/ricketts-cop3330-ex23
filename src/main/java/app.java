/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String input;

        System.out.println("Please enter \"y\" for yes and \"n\" for no for all questions.\nIs the car silent when you turn the key?");
        scan = new Scanner(System.in);
        input = scan.next();

        if(input.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            scan = new Scanner(System.in);
            input = scan.next();

            if(input.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            scan = new Scanner(System.in);
            input = scan.next();

            if(input.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                scan = new Scanner(System.in);
                input = scan.next();

                if(input.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    scan = new Scanner(System.in);
                    input = scan.next();

                    if (input.equals("y"))
                    {
                        System.out.println("Does your car have fuel injection?");
                        scan = new Scanner(System.in);
                        input = scan.next();

                        if (input.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}