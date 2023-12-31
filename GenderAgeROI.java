/*2)Write a program to accept age and gender from the user and check the ROI according to condition
above 60
M: 7%
F: 7.5%

below 60
M,F: 5%

eg( age : 20 G: M  ROI=7%)*/

import java.util.Scanner;
public class GenderAgeROI 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = input.nextInt();

        System.out.println("Enter your gender (M/F) :");
        char gender = input.next().charAt(0);

        double roi;

        if(age>60) 
        {
            if (gender=='M') 
            {
                roi=7.0;
            } 
            else if(gender=='F') 
            {
                roi=7.5;
            } 
            else 
            {
                System.out.println("Invalid gender");
                return;
            }
        } 
        else 
        {
            if (gender=='M' || gender=='F') 
            {
                roi=5.0;
            } 
            else 
            {
                System.out.println("Invalid gender");
                return;
            }
        }

        System.out.println("The rate of interest (ROI) for you is : "+roi+"%");
    }
}
