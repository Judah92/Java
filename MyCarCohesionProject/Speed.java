public class Speed 
    {
        private int someSpeed;
        private int vpSomeSpeed;

        public Speed()
        {
            someSpeed = 60; //Initializing odometer
        }
        public Speed(int b)
        {
            vpSomeSpeed = b;
        }

        public int get_speed()
        {
            return someSpeed;
        }

        public int vp_get_speed()
        {
            if (vpSomeSpeed > 140 || vpSomeSpeed < 0)
            {
                throw new IllegalStateException("You're trying to access a speed above the Maximum (140) or below the Minimum (0)");
            }
            else
            {
                return vpSomeSpeed;
            }
        }
    }
