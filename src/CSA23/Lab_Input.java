package CSA23;

import java.util.Scanner;

public class Lab_Input {
    public static void main(String[] args) {
        double double1, double2;
        float float1, float2;
        short short1, short2;
        String string1, string2;

        try{
            Scanner doubleInput = new Scanner(System.in); Scanner floatInput = new Scanner(System.in);
            Scanner shortInput = new Scanner(System.in); Scanner stringInput = new Scanner(System.in);

            System.out.println("Enter 1st double data type input: ");
            double1 = doubleInput.nextDouble();

            System.out.println("Enter 2nd double data type input: ");
            double2 = doubleInput.nextDouble();

            System.out.println("Enter 1st float data type input: ");
            float1 = floatInput.nextFloat();

            System.out.println("Enter 2nd float data type input: ");
            float2 = floatInput.nextFloat();

            System.out.println("Enter 1st short data type input: ");
            short1 = shortInput.nextShort();

            System.out.println("Enter 2st short data type input: ");
            short2 = shortInput.nextShort();

            System.out.println("Enter 1st string data type input: ");
            string1 = stringInput.nextLine();

            System.out.println("Enter 2nd string data type input: ");
            string2 = stringInput.nextLine();

            System.out.println("double 1: " + double1 + "\tdouble 2: " + double2);
            System.out.println("float 1: " + float1 + "\tfloat 2: " + float2);
            System.out.println("short 1: " + short1 + "\tshort 2: " + short2);
            System.out.println("string 1: " + string1 + "\tstring 2: " + string2);

        }catch (Exception exception) {
            //exception.printStackTrace();
            System.out.print("Invalid input, Restarting program\n\n");
            main(null);
        }
    }
}
