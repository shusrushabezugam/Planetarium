
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
	public GasGaint(String commonName, double distanceFromTheSun, double siderealDay,double orbitalPeriod, boolean hasRings,
			int numberOfStatilites, String[] nameThreeBigSatellites,boolean hasCloudBelts)
	{
		super(commonName,distanceFromTheSun,siderealDay, orbitalPeriod, hasRings, numberOfStatilites, nameThreeBigSatellites);
		this.hasCloudBelts = hasCloudBelts;
	}

}
