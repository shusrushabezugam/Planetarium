
public class TerrestrialPlanets extends Planet
{
	//public String commonName;
	boolean  hasIceCaps;
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary()+"Has Ice Caps = "+hasIceCaps;
	}

	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		
		return "Terrestrial Planet";
		
	}
	
	
	public TerrestrialPlanets(String commonName,double siderealDay, double distanceFromTheSun, double orbitalPeriod, boolean hasRings,
			int numberOfStatilites, String[] nameThreeBigSatellites, boolean hasIceCaps) {
	
		super(commonName, siderealDay, distanceFromTheSun, orbitalPeriod,  hasRings, numberOfStatilites, nameThreeBigSatellites);
		
		this.hasIceCaps = hasIceCaps;
		
	}
	
	

}
