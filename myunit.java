import java.util.Scanner; // import the Scanner class
import javax.swing.JOptionPane;
import javax.swing.*;

class myunit {
  public static void main(String[] args) {

//units
  int meters;
  int centimeters;
  int millimeters;
  int minutes;
  int days;
  int hours;

  String[] Measurement = {"Length", "Time", "Volume", "Mass", "Data"};
  String getMeasurement = (String) JOptionPane.showInputDialog(
               null,
               "Choose Measurement",
               "Measurement",
               JOptionPane.QUESTION_MESSAGE,
               null,
               Measurement,
               Measurement[3]);

if (getMeasurement == "Length")
{
  String[] startunit = {"km", "m", "cm", "mm",};
  String getstartunit = (String) JOptionPane.showInputDialog(
               null,
               "Select Starting Unit",
               "Length",
               JOptionPane.QUESTION_MESSAGE,
               null,
               startunit,
               startunit[3]);

  if (getstartunit == "km"){
    System.out.println("Enter kilometers:");     // Enter kilometers and press Enter
    Scanner kilometers = new Scanner(System.in);
    meters = kilometers.nextInt();
    System.out.println( (meters * 1000)  +   "meters");
  }
  else if (getstartunit == "cm") {
    System.out.println("Enter kilometers:");     // Enter kilometers and press Enter
    Scanner kilometers = new Scanner(System.in);
    centimeters = kilometers.nextInt();
    System.out.println( (centimeters * 10000)  +   "centimeters");
  }
  else {
    Scanner kilometers = new Scanner(System.in);
    System.out.println("Enter kilometers:");     // Enter kilometers and press Enter
    millimeters = kilometers.nextInt();
    System.out.println( (millimeters * 1000000)  +   "millimeters");
}
}
else if (getMeasurement == "Time") {
  String[] startunit = {"s", "min", "hr", "day","week","month","year","decade","century","ns","ms","mas"};
  String getstartunit = (String) JOptionPane.showInputDialog(
               null,
               "Select Starting Unit",
               "Time",
               JOptionPane.QUESTION_MESSAGE,
               null,
               startunit,
               startunit[3]);

  if (getstartunit == "s"){
    System.out.println("Enter seconds:");     // Enter kilometers and press Enter
    Scanner seconds = new Scanner(System.in);
    minutes = seconds.nextInt();
    System.out.println( (minutes * .0166)  +   "minutes");
  }
  else if (getstartunit == "min") {
    System.out.println("Enter seconds:");     // Enter kilometers and press Enter
    Scanner seconds = new Scanner(System.in);
    hours = seconds.nextInt();
    System.out.println( (hours * 0.000277778)  +   "hours");
  }
  else {
    Scanner seconds = new Scanner(System.in);
    System.out.println("Enter seconds:");     // Enter kilometers and press Enter
    days = seconds.nextInt();
    System.out.println( (days * 0.00001157407)  +   "days");
}
}
else {
JOptionPane.showMessageDialog(null, "You must select a unit to convert");
}

}
}
