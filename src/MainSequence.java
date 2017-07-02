
public class MainSequence extends Star
{
	public String getCelestialClassification()
	{
		
		return "Main Sequence Star";
	}
	public MainSequence(String commonName, String constellationDesignation, SpectralType type, double apparentMagnitude,
			double absoluteMagnitude, LY distanceFromTheSun, String[] planets,SolarMass relativeMass) {
		super(commonName, constellationDesignation, type, apparentMagnitude, absoluteMagnitude, distanceFromTheSun, planets,relativeMass);
		
	}

	public String getFactualSummary()
	{
		
		return super.getFactualSummary()+"Spectral Type = "+getSpectralType();
	}
}
