public class MyCar
    {
    private int odometer; //Declaring variables in the classes scope. Ref: in class example 1_25
    private int current_Speed;
    private int current_Gear;

        public MyCar() //Initializing variables through default constructor. Ref: in class example 1_25
        {
            odometer = 0;      // 0 Miles
            current_Speed = 0; // 0 MPH
            current_Gear = 0;  // 0 Gear
        }

        public MyCar(int o, int cs, int cg) //Value Pass constructor
        {
            odometer = o;
            current_Speed = cs;
            current_Gear = cg;
        }

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
    }