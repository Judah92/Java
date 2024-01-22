public class MyCar
{
    private int odometer = 500; // 500 miles on the dash
    private int current_Speed = 0; //Speed: Stopped
    private int current_Gear = 0; //Gear: Neutral  

        public void mutator (int o, int cs, int cg) //Mutator function to change values
        {
            odometer = o;
            current_Speed = cs;
            current_Gear = cg;
        }
        public int get_o() //Accessor Methods to access the variables
        {                  //Odomoter
            return odometer;  
        }
        public int get_cs() //Current Speed 
        {
            return current_Speed; 
        }
        public int get_cg() //Current Gear 
        {
            return current_Gear; 
        }
        public static void main(String[] args) //Required for compiling
        {
            System.out.println("Main Method required for Compiling");
        }
}