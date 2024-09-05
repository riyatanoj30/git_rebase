// // Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

// // import java.util.Scanner;
// // public class Exercise1 {

// //     public static void main(String[] args){
// //         Scanner input = new Scanner(System.in);
// //         System.out.println("Enter a degree in Fahrenheit");
// //         double fahrenheit = input.nextDouble();
// //         double celsius = ((5*(fahrenheit - 32.0))/9.0);
// //         System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
// //     }
// // }



// // Write a Java program that reads a number in inches and converts it to meters.

// // import java.util.Scanner;
// // public class Exercise1 {

// //     public static void main(String[] args){
// //         Scanner input = new Scanner(System.in);
// //         System.out.println("Enter a degree in Inches");
// //         double Inches = input.nextDouble();
// //         double Meter = (Inches * 0.0254);
// //         System.out.println(Inches + " degree Inches is equal to " + Meter + " in Meter");
// //     }
// // }



// // Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

// // import java.util.Scanner;
// // public class Exercise1 {

// //     public static void main(String[] args){
// //         Scanner input = new Scanner(System.in);
// //         System.out.println("Enter an Integer between 0 to 1000: ");
// //         int num = input.nextInt();
// //         int firstDigit = num % 10;
// //         int remainingNumber = num / 10;
// //         int SecondDigit = remainingNumber % 10;
// //         remainingNumber = remainingNumber / 10;
// //         int thirdDigit = remainingNumber % 10;
// //         remainingNumber = remainingNumber / 10;
// //         int fourthDigit = remainingNumber % 10;
// //         int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
// //         System.out.println("The sum of all digits in " + num + " is " + sum);

// //     }
// // }



// // Write a Java program to convert minutes into years and days.

// import java.util.Scanner;
// public class Exercise1 {

//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a Minute");
//         double Minute = input.nextDouble();
//         double Year = (Minute * 1.90259e-6);
//         double Days = (Minute * 0.000694444);
//         System.out.println(Minute + " Minute is equal to " + Year + " in Year");
//         System.out.println(Minute + " Minute is equal to " + Days + " in Days");
//     }
// }



// Write a Java program that prints the current time in GMT.

// import java.util.Scanner;
// public class Exercise1 {

//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter Todays Date: ");
//         int Day = input.nextInt();
//         System.out.println("Enter Current Time: ");
//         int Time = input.nextInt();
//         String GMT = ();
//         System.out.println("Your BMI is equal to " + GMT);
//     }
// }


// Write a Java program to compute the body mass index (BMI)

// import java.util.Scanner;
// public class Exercise1 {

//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your weight in Kilogram: ");
//         double Weight = input.nextDouble();
//         System.out.println("Enter your Height in meter: ");
//         double Height = input.nextDouble();
//         double BMI = (Weight/(Height*Height));
//         System.out.println("Your BMI is equal to " + BMI);
//     }
// }



// Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour

// import java.util.Scanner;
// public class Exercise1 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter distance traveled in meters: ");
//         double meters = input.nextDouble();
//         double kilometers = meters * 0.001;
//         double miles = meters * 0.000621371;
//         System.out.println("Enter time taken in seconds: ");
//         double seconds = input.nextDouble();
//         double minutes = seconds / 60.0;
//         double hours = seconds / 3600.0;
//         System.out.println("Choose answer type: 1 for m/sec, 2 for km/hr, 3 for mi/hr");
//         int choice = input.nextInt();
//         double speed;
//         switch (choice) {
//             case 1:
//                 speed = meters / seconds;
//                 System.out.println("Speed is equal to " + speed + " m/sec");
//                 break;
//             case 2:
//                 speed = kilometers / hours;
//                 System.out.println("Speed is equal to " + speed + " km/hr");
//                 break;
//             case 3:
//                 speed = miles / hours;
//                 System.out.println("Speed is equal to " + speed + " mi/hr");
//                 break;
//             default:
//                 System.out.println("Wrong input");
//                 break;
//         }
//         input.close();
//     }
// }
