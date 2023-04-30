import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // Formula 1 mile = 1.609344 kilometers/n x 1.609344
        //ASK USER TO ENTER NUMBER OF MILES & WRITE A JAVA PROgrAM TO CONVERT IT INTO KM OUTPUT EXAMPLE :
        // YOU ENTER ... OF MILES AND IT WILL BE ... KM

        Scanner c = new Scanner(System.in);
       // System.out.println(" Enter number of miles:");
       // double miles=c.nextDouble();
       // double kilometers = miles * 1.609344;
       // System.out.println( miles + " miles =" + "km " + kilometers);
        // ASK USER TO ENTER NUMBER OF INCHES & WRITE JAVA PROGRAM TO CONVERT IT TO METERS OUTPUT : YOU ENTER
        //INCH & IT WILL BE ... METERS
       /* System.out.println("Enter number of inches;");
        double inches=c.nextDouble();
        double meters = inches *0.0254;
        System.out.println(inches + " inches = " + meters + " meters "); */

      //  System.out.println(" PLease enter your weight:");
      //  double weight = c.nextDouble();
      //  System.out.println(" Please enter your height");
       // double height = c.nextDouble();
       // double BMI = weight / (height* height);
       // System.out.println("your weight is "+ weight + " your height is " + height + " your BMI is " + BMI);
        // Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
        // hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
        System.out.println("Please enter your distance");
        float distance = c.nextFloat();
        System.out.println(" Enter the hour:" );
        float hr= c.nextFloat();
        System.out.println(" Please enter the minutes:");
        float min = c.nextFloat();
        System.out.println(" Enter the seconds:");
        float sec = c.nextFloat();
        float timeSeconds = (hr * 3600) + (min * 60)+sec;
        float mps= distance / timeSeconds;
        float kmph = (distance * 1000.0f) /(timeSeconds/3000.0f);
        float mph =kmph/1.609f;
        System.out.println( " your speed in meters/second is " + mps);
        System.out.println("your speed in km/hour" + kmph);
        System.out.println("your speed in miles/h is"+mph);






        







    }
}
