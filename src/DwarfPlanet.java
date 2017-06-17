
public class DwarfPlanet extends Planet
{
	public boolean hasIrregularShape;
	@Override
	public String getFactualSummary()
	{
		// TODO Auto-generated method stub
		return super.getFactualSummary()+"Has Irregular Shape ="+hasIrregularShape;
		
	}

	@Override
	public String getCelestialClassification() 
	{
		return "Dwarf Planet";	
	}

	public DwarfPlanet(String commonName,  double distanceFromTheSun,double siderealDay, double orbitalPeriod,boolean hasRings
			,int numberOfStatilites,String[] nameThreeBigSatellites, boolean hasIrregularShape)
	{
		super(commonName,  distanceFromTheSun, siderealDay,orbitalPeriod, hasRings, numberOfStatilites,nameThreeBigSatellites);
		this.hasIrregularShape = hasIrregularShape;
	}
}
