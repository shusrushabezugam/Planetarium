
public class MainSequence extends Star
{

	protected double relativeMass=1.0;
	@Override
	public String getCelestialClassification()
	{
		// TODO Auto-generated method stub
		return "Main Sequence Star";
	}
	
	public MainSequence(String commonName, SpectralType type, double apparentMagnitude, double absoluteMagnitude,
			double distanceFromTheSun, String[] planets) {
		super(commonName, type, apparentMagnitude, absoluteMagnitude, distanceFromTheSun, planets);
		// TODO Auto-generated constructor stub
	}
	public String getFactualSummary()
	{
		// TODO Auto-generated method stub
		return super.getFactualSummary()+"Relative Mass"+relativeMass+"\nSpectral Type = "+Star.SpectralType.K;
	}
}
