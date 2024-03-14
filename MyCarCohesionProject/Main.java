import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileReader;

public class Main 
    {
        public static void main (String[] args)
        {

            MyCar firstCar = new MyCar(); //default constructor: Default Values. Ref: in class example 1_25
            MyCar newCar_vp = new MyCar(5000, 25, 6); //Value Pass constructor: A: Miles, B: Speed, C: Gear
            
            
            System.out.println("Default Constructor Odometer test: " + firstCar.get_odometer_info());
            System.out.println("VP Constructor Odometer test: " + newCar_vp.get_odometer_info_vp());

            System.out.println("Default Constructor Speed test: " + firstCar.get_speed_info());
            System.out.println("VP Constructor Speed test: " + newCar_vp.get_speed_info_vp());

            System.out.println("Default Constructor Gear test: " + firstCar.get_gear_info()); //default constructor for Gear
            System.out.println("VP Constructor Gear test: " + newCar_vp.get_gear_info_vp()); //VP constructor for Gear
        }
    }
    

    