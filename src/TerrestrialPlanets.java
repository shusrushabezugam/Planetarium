
public class TerrestrialPlanets extends Planet
{
	//public String commonName;
	boolean  hasIceCaps;
	
	@Override
	public String getFactualSummary() {
		String a = getCelestialClassification();
		return a ;
	}

	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		String[] name = {"Venus","Earth","Mars","Jupiter"};
		String classification = "Terrestrial Planets";
		String[] distance = {"0.39 AU", "0.72 AU", "1.0 AU", "1.524 AU"};
		Double[] sidereal = {58.65, 243.1 ,1.0, 1.026};
		Double[] orbital = {87.97, 224.7, 365.256, 687.0};
		boolean[] rings = {false,false,false,false};
		int[] satellites = {0,0,1,2};
		String[] largestSatellites = {};
		boolean iceCaps[] = {false,false,false,false};
		return "Terrestrial";
		
	}
	
	public TerrestrialPlanets()
	{
		super();
	}

}
