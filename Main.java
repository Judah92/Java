public class Main 
{
    public static void main (String[] args)
    {
        MyCar firstCar = new MyCar(); //default constructor: Default Values. Ref: in class example 1_25
        MyCar newCar_vp = new MyCar(1200, 60, 5); //Value Pass constructor: Miles, Speed, Gear. Ref: in class example 1_25
        
        System.out.println("Default Constructor Values: " + firstCar.get_o() + ", " 
        + firstCar.get_cg() + ", " + firstCar.get_cs()); //Printing default constructor values
        
        firstCar.mutator(800, 55, 4); //Setting Mutator values for firstCar object
        System.out.println ("Mutator Values: "  + firstCar.get_o() 
        + ", " + firstCar.get_cg() + ", " + firstCar.get_cs());// and printing values
        
        System.out.println("Value Pass Constructor Values: " + newCar_vp.get_o() 
        + ", " + newCar_vp.get_cg() + ", " + newCar_vp.get_cs()); //Printing value pass constructor values

    }

}