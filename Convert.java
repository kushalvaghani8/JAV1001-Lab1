
/*
Name:               Kushal Vaghani
student number:     A00247163
JAV-1001 - 11329 -  App Development for Android - 202201 - 001
Lab 1 - Variables and Logic
*/


import java.util.Scanner;  // Import the Scanner class

public class Convert {
  public static void main(String[] args) {

    Double outPutValue         = 0.0;
    Double userValueDouble     = 0.0;
    Double toMiles             = 0.62137;
    Double toInches            = 0.39;
    Double toKg                = 0.45;
    Double toF                 = 0.0;

    System.out.println("\nPlease enter the number first and after a space unit to convert to \n e.g. '10 km'. \nThis converter can convert\n km <-> mi,\n cm <-> in,\n lb <-> kg\n and\n C <-> F");

    Scanner userScannerInput = new Scanner(System.in); // Create a Scanner object

    System.out.println("Enter a value to convert:");
    String userValueEntered = userScannerInput.next(); //read user input to convert

    try //to convert userValueEntered - string to Double
    {
      userValueDouble = Double.valueOf(userValueEntered);

    } catch(Exception e){
      System.out.println("The input " + userValueEntered + " is not a number and therefore will not be converted");
      return;
    }

    String userUnitValue = userScannerInput.next(); // Read user input for unit to convert



    if (userUnitValue.equals("km") || userUnitValue.equals ("mi") || userUnitValue.equals ("cm") || userUnitValue.equals ("in") || userUnitValue.equals ("lb") || userUnitValue.equals ("kg") || userUnitValue.equals ("C")|| userUnitValue.equals ("F"))
    {
      //////converting from km to mi and from mi to km
      if (userUnitValue.equals ("km")) {
        outPutValue =  (userValueDouble * toMiles);
        System.out.println(userValueEntered + " km = " + String.format("%.2f", outPutValue) + " mi");
      }

      else if (userUnitValue.equals ("mi")) {
        outPutValue = (userValueDouble / toMiles);
        System.out.println(userValueEntered + " mi = " + String.format("%.2f", outPutValue) + " km" );
      }
      //////converting from cm to in and from in to cm
      else if (userUnitValue.equals ("cm")) {
        outPutValue =  (userValueDouble * toInches);
        System.out.println(userValueEntered + " cm = " + String.format("%.2f", outPutValue) + " in");
      }

      else if (userUnitValue.equals ("in")) {
        outPutValue = (userValueDouble / toInches);
        System.out.println(userValueEntered + " in = " + String.format("%.2f", outPutValue) + " cm" );
      }
      //////converting from lb to kg and from kg to lb
      else if (userUnitValue.equals ("lb")) {
        outPutValue =  (userValueDouble * toKg);
        System.out.println(userValueEntered + " lb = " + String.format("%.2f", outPutValue) + " kg");
      }

      else if (userUnitValue.equals ("kg")) {
        outPutValue = (userValueDouble / toKg);
        System.out.println(userValueEntered + " kg = " + String.format("%.2f", outPutValue) + " lb" );
      }

      //////converting from C to F and from F to C
      else if (userUnitValue.equals ("C")) {
        outPutValue = (userValueDouble * 1.8) + 32;
        System.out.println(userValueEntered + " C = " + String.format("%.2f", outPutValue) + " F");
      }

      else if (userUnitValue.equals ("F")) {
        outPutValue = (userValueDouble - 32) * 0.55555556;
        System.out.println(userValueEntered + " F = " + String.format("%.2f", outPutValue) + " C");
      }

    }
    ////// if unit value entered is incorrect - this message will be displayed
    else {
      System.out.println("Invalid unit value, " + userValueEntered + " will not be converted");
    }

  }
}
