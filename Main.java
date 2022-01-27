import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static void main(String[] args) {

    Double miValue = 0.0;
    Double toMiles = 0.62137;
    int valueInt = 0;
    Double toInches = 0.39;
    Double toKg = 0.45;

    System.out.println("Please enter the number first and after a space unit to convert to e.g. '10 km'");

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



    if (unitValue.equals("km") || unitValue.equals ("mi") || unitValue.equals ("cm") || unitValue.equals ("in") || unitValue.equals ("lb") || unitValue.equals ("kg"))
    {
      //////converting from km to mi and from mi to km
      if (unitValue.equals ("km")) {
        miValue =  (valueInt * toMiles);
        System.out.println(valueEntered + " km = " + miValue + " mi");
      }

      else if (unitValue.equals ("mi")) {
        miValue = (valueInt / toMiles);
        System.out.println(valueEntered + " mi = " + miValue + " km" );
      }


      else if (unitValue.equals ("cm")) {
        miValue =  (valueInt * toInches);
        System.out.println(valueEntered + " cm = " + miValue + " in");
      }

      else if (unitValue.equals ("in")) {
        miValue = (valueInt / toInches);
        System.out.println(valueEntered + " in = " + miValue + " cm" );
      }
      else if (unitValue.equals ("lb")) {
        miValue =  (valueInt * toKg);
        System.out.println(valueEntered + " lb = " + miValue + " kg");
      }

      else if (unitValue.equals ("kg")) {
        miValue = (valueInt / toKg);
        System.out.println(valueEntered + " kg = " + miValue + " lb" );
      }
    }
    else {
      System.out.println("Invalid unit value " + valueEntered + "will not be converted");
    }

  }
}
