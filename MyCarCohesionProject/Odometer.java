
public class Odometer
    {
        private int the_Odometer;
        private int vpOdometer;

        public Odometer()
        {
            the_Odometer = 2500; //default constructor value
        }
        public Odometer(int a)
        {
            vpOdometer = a; //value pass constructor value
        }

        public int get_odometer()
        {
            return the_Odometer;
        }

        public int vp_get_odometer()
        {
            return vpOdometer;
        }

    }