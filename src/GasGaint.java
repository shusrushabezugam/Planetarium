
public class GasGaint extends Planet
{
	public boolean hasCloudBelts;
	


	@Override
	public String getFactualSummary() {
		// TODO Auto-generated method stub
		return super.getFactualSummary()+"Has Cloud Belts = "+hasCloudBelts;
	}

	@Override
	public String getCelestialClassification()
	{
		// TODO Auto-generated method stub
		return "Gas Gaint Planet";
	}
	public GasGaint(String commonName, AU distanceFromTheSun3, EarthDay siderealDay,EarthDay orbitalPeriod, boolean hasRings,
			int numberOfStatilites, String[] nameThreeBigSatellites,boolean hasCloudBelts,EarthMass relativeMassinem,MicroSun relativeMassinms)
	{
		super(commonName,distanceFromTheSun3,siderealDay, orbitalPeriod, hasRings, numberOfStatilites, nameThreeBigSatellites,relativeMassinem, relativeMassinms);
		this.hasCloudBelts = hasCloudBelts;
	}

}
