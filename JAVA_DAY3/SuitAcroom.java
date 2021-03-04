public class SuitAcroom extends HotelRoom{
		private int ratePerSqFeet ;
		

		public SuitAcroom() {
			super();
		}

		public SuitAcroom(int ratePerSqFeet) {
			super();
			this.ratePerSqFeet = 15;
		}

		public int getRatePerSqFeet() {
			return ratePerSqFeet;
		}

		public void setRatePerSqFeet(int ratePerSqFeet) {
			this.ratePerSqFeet = ratePerSqFeet;
		}
		
		public int getRatePerSqFeet(boolean hasWifi,int ratePerSqFeet )
		{
			if(hasWifi==true)
			{
				return (ratePerSqFeet + 2) ;
			}
			else
			{
				return ratePerSqFeet;
			}
	
		}
		
}