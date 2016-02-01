import java.io.*;
import java.util.Scanner;

class Car {
  double startMiles;
  double endMiles;
  double gallons;

  Car(double first) {
    startMiles = first;
  }

  void fillUp(double miles, double gallons) {
    endMiles = miles;
    gallons = gallons;
  }

  double calculateMPG() {
    return (endMiles - startMiles)/gallons;
  }
  boolean gasHog() {
    if (calculateMPG() < 15.0) return true;
    return false;
  }
  boolean economyCar() {
    if (calculateMPG() > 30.0) return true;
    return false;
  }
}

class MilesPerGallon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double startMiles, endMiles, gallons;

    System.out.print("Current odometer reading: "); 
      startMiles = input.nextDouble();

      Car car = new Car(startMiles);
 
      System.out.println("Filling station visit ");
      System.out.print("Current odometer reading: ");
      endMiles = input.nextDouble();
      System.out.print("Gas put in: ");
      gallons = input.nextDouble();
      
      car.fillUp(endMiles, gallons);
      System.out.println("Miles per gallon: " + car.calculateMPG());

      if (car.gasHog()) {
        System.out.println("Gas Hog.");
      }
      if (car.economyCar()) {
        System.out.println("Economy Car!");
      }
  }
}