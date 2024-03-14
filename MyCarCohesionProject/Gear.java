public class Gear
    {
        private int the_Gear;
        private int vpGear;
        //private String wrongGear = "You're trying to access a gear above the maximum (6) or below the minimum (1)";

        public Gear()
        {
            the_Gear = 4;
        }
        public Gear(int c)
        {
            vpGear = c;
        }

        public int get_gear()
        {
            return the_Gear;
        }

        public int vp_get_gear()
        {
            if (vpGear > 6 || vpGear < 1) //Functioning gear checker - throwing an illegalstateexception if gear value is out of bounds.
            {                           
                //return wrongGear;
                throw new IllegalStateException("You're trying to access a gear above the maximum (6) or below the minimum (1)");
            }
            else
            {
                return vpGear;
            }
        }
    }