import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static void main(String[] args) {

    Double outPutValue  = 0.0;
    Double toMiles  = 0.62137;
    int valueInt    = 0;
    Double toInches = 0.39;
    Double toKg     = 0.45;
    Double toF      = 0.0;

    System.out.println("\nPlease enter the number first and after a space unit to convert to \n e.g. '10 km'. \nThis converter can convert\n km <-> mi,\n cm <-> in,\n lb <-> kg\n and\n C <-> F");

    Scanner userValue = new Scanner(System.in); // Create a Scanner object

    System.out.println("Enter a value to convert:");
    String valueEntered = userValue.next(); //read user input for int to convert

    try
    {
      valueInt = Integer.valueOf(valueEntered);

    } catch(Exception e){
      System.out.println("The input is not an integer and therefore will not be converted");
      return;
    }

    String unitValue = userValue.next(); // Read user input for unit to convert



    if (unitValue.equals("km") || unitValue.equals ("mi") || unitValue.equals ("cm") || unitValue.equals ("in") || unitValue.equals ("lb") || unitValue.equals ("kg") || unitValue.equals ("C")|| unitValue.equals ("F"))
    {
      //////converting from km to mi and from mi to km
      if (unitValue.equals ("km")) {
        outPutValue =  (valueInt * toMiles);
        System.out.println(valueEntered + " km = " + outPutValue + " mi");
      }

      else if (unitValue.equals ("mi")) {
        outPutValue = (valueInt / toMiles);
        System.out.println(valueEntered + " mi = " + outPutValue + " km" );
      }


      else if (unitValue.equals ("cm")) {
        outPutValue =  (valueInt * toInches);
        System.out.println(valueEntered + " cm = " + outPutValue + " in");
      }

      else if (unitValue.equals ("in")) {
        outPutValue = (valueInt / toInches);
        System.out.println(valueEntered + " in = " + outPutValue + " cm" );
      }
      else if (unitValue.equals ("lb")) {
        outPutValue =  (valueInt * toKg);
        System.out.println(valueEntered + " lb = " + outPutValue + " kg");
      }

      else if (unitValue.equals ("kg")) {
        outPutValue = (valueInt / toKg);
        System.out.println(valueEntered + " kg = " + outPutValue + " lb" );
      }

      else if (unitValue.equals ("C")) {
        outPutValue = (valueInt * 1.8) + 32;
        System.out.println(valueEntered + " C = " + outPutValue + " F");
      }

    else if (unitValue.equals ("F")) {
      outPutValue = (valueInt - 32) * 0.55555556;
      System.out.println(valueEntered + " F = " + outPutValue + " C");
    }

}

    else {
      System.out.println("Invalid unit value " + valueEntered + " will not be converted");
    }

  }
}
