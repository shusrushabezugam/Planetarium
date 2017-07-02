
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

	public DwarfPlanet(String commonName,AU distanceFromTheSun4,EarthDay siderealDay,EarthDay orbitalPeriod,boolean hasRings
			,int numberOfStatilites,String[] nameThreeBigSatellites, boolean hasIrregularShape,EarthMass relativeMassinem,MicroSun relativeMassinms)
	{
		super(commonName, distanceFromTheSun4, siderealDay,orbitalPeriod, hasRings, numberOfStatilites,nameThreeBigSatellites,relativeMassinem,relativeMassinms);
		this.hasIrregularShape = hasIrregularShape;
	}
}
