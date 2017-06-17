
public class Gaint extends Star 
{	
	
	
	protected String constellationDesignation="Alpha Bootis";
	public enum Gaintness{supergaint,gaint,subgaint}; 

	@Override
	public String getCelestialClassification() {
		
		return "Gaint Star";
	}

	@Override
	public String getFactualSummary() 
	{
	
		
		
		return super.getFactualSummary()+"constellationDesignation"+constellationDesignation+"\nSpectral Type = "+Star.SpectralType.G;	
	}


	public Gaint(String commonName, SpectralType type, double apparentMagnitude, double absoluteMagnitude,
			double distanceFromTheSun, String[] planets,Gaintness g) {
		super(commonName, type, apparentMagnitude, absoluteMagnitude, distanceFromTheSun, planets);
		// TODO Auto-generated constructor stub
		
	}

	

	

}
