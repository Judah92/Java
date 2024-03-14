public class MyCar
	{
		private Odometer theOdometer;
		private Odometer vpOdometer;
		private Speed theSpeed;
		private Speed vpTheSpeed;
		private Gear theGear;
		private Gear vpTheGear;

		public MyCar() //default constructor
		{
			theOdometer = new Odometer();
			theSpeed = new Speed();
			theGear = new Gear();
		}
		
		public MyCar(int a, int b, int c) //value pass constructor
		{
			vpOdometer = new Odometer(a);
			vpTheSpeed = new Speed(b);
			vpTheGear = new Gear (c);
		}

		public int get_odometer_info() // Odometer Getter'
		{
			return theOdometer.get_odometer();
		}
		
		public int get_odometer_info_vp() //VP Odometer Getter'
		{
			return vpOdometer.vp_get_odometer();
		}

		public int get_speed_info() // Speed Getter'
		{
			return theSpeed.get_speed();
		}
		
		public int get_speed_info_vp() //VP Speed Getter'
		{
			return vpTheSpeed.vp_get_speed();
		}

		public int get_gear_info() //Gear Getter'
		{
			return theGear.get_gear();
		}
		
		public int get_gear_info_vp() //VP Gear Getter'
		{
			return vpTheGear.vp_get_gear();
		}
		
	}	