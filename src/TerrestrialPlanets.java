
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
	
	
	public TerrestrialPlanets(String commonName,AU distanceFromTheSun2,EarthDay siderealDay, EarthDay orbitalPeriod, boolean hasRings,
			int numberOfStatilites, String[] nameThreeBigSatellites, boolean hasIceCaps,EarthMass relativeMassinem,MicroSun relativeMassinms) {
	
		super(commonName,distanceFromTheSun2,siderealDay, orbitalPeriod, hasRings, numberOfStatilites, nameThreeBigSatellites,relativeMassinem, relativeMassinms);
		
		this.hasIceCaps = hasIceCaps;
		
	}

	
	
	

}
